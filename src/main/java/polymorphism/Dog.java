package polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String sound() {
        return "Wooof";
    }

}
