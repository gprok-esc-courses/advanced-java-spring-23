package OOP;

public class Suv extends Car {
    public Suv(String plate) {
        super(plate);
    }

    @Override
    public void draw() {
        System.out.println("Painting the " + plate + " suv");
    }
}
