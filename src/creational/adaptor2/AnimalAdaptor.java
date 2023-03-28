package creational.adaptor2;

public class AnimalAdaptor implements Toy {

    Animal animal;

    public AnimalAdaptor(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void dance() {
        animal.run();
    }
}
