package creational.adaptor;

class Sparrow implements Bird {
    // a concrete implementation of bird
    public void fly() {

        System.out.println("Sparrow - Flying");
    }

    public void makeSound() {
        System.out.println("Sparrow - Chirp Chirp");
    }
}
