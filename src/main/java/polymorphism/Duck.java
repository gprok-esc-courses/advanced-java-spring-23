package polymorphism;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String sound() {
        return "Quack";
    }

}
