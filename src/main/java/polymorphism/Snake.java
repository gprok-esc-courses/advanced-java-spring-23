package polymorphism;

public class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Snake";
    }

    @Override
    public String sound() {
        return "Fsssss";
    }
}
