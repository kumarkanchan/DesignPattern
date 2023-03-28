package creational.adaptor2;

public class AnimalAdaptorTest {
    public static void main(String[] args) {
        AnimalHorse animalHorse = new AnimalHorse();
        ToyElephant toyAnimalElephant = new ToyElephant();

        System.out.println("ANIMAL HORSE ## ");
        animalHorse.run();

        System.out.println("TOY ELEPHANT ## ");
        toyAnimalElephant.dance();

        System.out.println("ANIMAL ADAPTOR ## ");
        Toy animalAdaptor = new AnimalAdaptor(animalHorse);
        animalAdaptor.dance();
    }
}
