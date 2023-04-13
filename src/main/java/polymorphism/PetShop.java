package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Animal> animals;

    public PetShop() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void print() {
        for(Animal animal : animals) {
            System.out.println(animal.getName() + " is a " + animal.getType() + " and says " + animal.sound());
        }
    }

    public static void main(String[] args) {
        PetShop shop = new PetShop();
        shop.addAnimal(new Dog("Pluto"));
        shop.addAnimal(new Cat("Sylvester"));
        shop.addAnimal(new Duck("Donald"));
        shop.addAnimal(new Snake("Mike"));

        shop.print();
    }
}
