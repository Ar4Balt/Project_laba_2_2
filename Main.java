import taxiDepot.Car;
import taxiDepot.economy.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new HyundaiSolaris());
        cars.add(new ChevroletLacetti());
        for (Car car: cars) {
            System.out.println(car.info());
        }
    }
}