package service;

import entity.Car;

import java.io.IOException;
import java.util.List;

import static service.CarAttributeService.*;
import static service.FileService.parseString;

/**
 * Car Factory
 */
public class CarService {

    // Global properties / data
    private final String propertyFileName = "src/main/resources/cars.txt";
    private static final String delimiter = ", ";
    private List<String> data;
    private FileService fileService;
    private int carNum;

    /**
     * Initializing phase -> prepare / load data
     * @throws IOException
     */
    public CarService() throws IOException {
        fileService = new FileService();
        data = fileService.readFile(propertyFileName);
        carNum = data.size();
    }

    /**
     * Process data over Car Factory
     * @return Array of Cars
     */
    public Car[] getCars(){
        // Creating array of cars the same size as lines of cars.txt
        Car[] cars = new Car[carNum];

        // Init in cycle, for every car
        for (int i = 0; i < carNum; i++){

            // Creating new instance of Car -> to set its attributes and add him to array to get result
            Car car = new Car();

            // Data processing, regarding its format, parsing, etc. -> in FileService
            String[] parsedLine = parseString(data.get(i), delimiter);

            // Logic for deciding what enum use (or any other logic deciding attribute, is in Car Attribute Service)
            car.setEngine(decideEngine(parsedLine[0]));
            car.setSuspension(decideSuspension(parsedLine[1]));
            car.setBreaks(decideBreaks(parsedLine[2]));

            // Write built car into car array
            cars[i] = car;
        }
        return cars;
    }

    /**
     * toString for Array of cars
     * @param cars
     */
    public void readCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
