package OOP;

import java.util.LinkedList;

public class Fleet2 {
    private LinkedList<Car> cars;

    public Fleet2() {
        cars = new LinkedList<>();
        cars.add(new Bus("AA6754"));
        cars.add(new Suv("AB6344"));
        cars.add(new Bus("NM6754"));
        cars.add(new Bus("ZX6754"));
        cars.add(new Suv("AS6554"));
    }

    public void draw() {
        for (Car car : cars) {
            car.draw();
        }
    }

    public static void main(String[] args) {
        Fleet2 fleet = new Fleet2();
        fleet.draw();
    }
}
