import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int modalNo;
    private String name;
    private int stock;

    public Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }
    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }
    public int getModalNo() {
        return modalNo;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }
}

public class A3Q3 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2013, "Creta", 10));
        cars.add(new Car(2020, "MG", 13));
        cars.add(new Car(2018, "Kia", 20));
        cars.add(new Car(2017, "Audi", 45));
        cars.add(new Car(2015, "BMW", 55));
        Collections.sort(cars);
        System.out.println("Sorted List of Cars:");
        for (Car car : cars) {
            System.out.println(car.getModalNo() + " " + car.getName() + " " + car.getStock());
        }
    }
}
