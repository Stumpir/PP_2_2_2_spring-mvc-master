package web;

import java.util.Collections;
import java.util.List;

public class Car {

    private String model;
    private int series;
    private int cost;

    public Car() {}

    public Car(String model, int series, int cost) {
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static List<Car> get5Cars() {
        return List.of(new Car("Lancer x", 2007, 400), new Car("Outlander", 2020, 1500),
                new Car("Mark II", 1990, 1000), new Car("Camry", 2021, 2500),
                new Car("Silvia", 2000, 2000));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", cost=" + cost +
                '}';
    }
}
