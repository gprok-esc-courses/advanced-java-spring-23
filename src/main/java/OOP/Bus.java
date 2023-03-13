package OOP;

public class Bus extends Car {

    public Bus(String plate) {
        super(plate);
    }

    @Override
    public void draw() {
        System.out.println("Painting the " + plate + " bus");
    }

    public void paint() {
        System.out.println("Painting the " + plate + " bus");
    }
}
