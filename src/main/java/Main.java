import entity.Car;
import service.CarService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CarService carService = new CarService();
        Car[] cars = carService.getCars();
        carService.readCars(cars);
    }
}
