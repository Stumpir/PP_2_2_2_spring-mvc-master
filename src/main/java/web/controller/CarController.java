package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        List<Car> list = Car.get5Cars();
        CarService service = new CarServiceImpl();
        list = service.getCars(list, count);
        model.addAttribute("cars", list);
        return "cars";
    }
}
