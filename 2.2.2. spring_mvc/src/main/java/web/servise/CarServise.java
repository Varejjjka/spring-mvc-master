package web.servise;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServise {
    public static List<Car> getCars (int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mini Countryman", "111", "BMW"));
        carList.add(new Car("Smart", "222", "Mercedes"));
        carList.add(new Car("Soul", "333", "Kia"));
        carList.add(new Car("Jimny", "444", "Suzuki"));
        carList.add(new Car("Model S", "555", "Tesla"));

        if (count > 5) {
            count = 5;
        }
       return carList.subList(0, count);
    }
}
