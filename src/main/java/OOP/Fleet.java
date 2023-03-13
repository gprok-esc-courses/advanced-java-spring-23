package OOP;

public class Fleet {
    private Car [] cars;

    public Fleet() {
        cars = new Car[5];
        cars[0] = new Bus("AA6754");
        cars[1] = new Suv("AB6344");
        cars[2] = new Bus("NM6754");
        cars[3] = new Bus("ZX6754");
        cars[4] = new Suv("AS6554");
    }

    public void drawOld() {
        for (Car car : cars) {
            if(car instanceof Bus) {
                Bus bus = (Bus)car;
                bus.paint();
            }
            else if(car instanceof Suv) {
                Suv suv = (Suv)car;
                suv.draw();
            }
        }
    }

    public void draw() {
        for (Car car : cars) {
            car.draw();
        }
    }

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        fleet.draw();
    }
}
