package ploymorphism;

class PAnimal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}
class PDog extends PAnimal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
class PCat extends PAnimal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
class PLion extends PAnimal {
    @Override
    void makeSound() {
        System.out.println("Roar");
    }
}
public class PolymorphicArray {
    public static void main(String[] args) {
        PAnimal[] animals = new PAnimal[4];
        animals[0] = new PAnimal();
        animals[1] = new PDog();
        animals[2] = new PCat();
        animals[3] = new PLion();
        for (PAnimal animal : animals) {
            animal.makeSound();
        }
    }
}