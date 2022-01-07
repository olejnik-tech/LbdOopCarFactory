package service;

import entity.Car;

import java.io.IOException;
import java.util.List;

import static service.CarAttributeService.*;
import static service.FileService.parseString;

public class CarService {

    private final String propertyFileName = "src/main/resources/cars.txt";
    private static final String delimiter = ", ";
    private List<String> data;
    private FileService fileService;
    private int carNum;

    public CarService() throws IOException {
        fileService = new FileService();
        data = fileService.readFile(propertyFileName);
        carNum = data.size();

    }

    public Car[] getCars(){
        Car[] cars = new Car[carNum];

        for (int i = 0; i < carNum; i++){
            Car car = new Car();
            String[] parsedLine = parseString(data.get(i), delimiter);
            car.setEngine(decideEngine(parsedLine[0]));
            car.setSuspension(decideSuspension(parsedLine[1]));
            car.setBreaks(decideBreaks(parsedLine[2]));
            cars[i] = car;
        }
        return cars;
    }

    public void readCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
