package web.service;

import web.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(List<Car> list, Integer count);
}
