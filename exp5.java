class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Single inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

// Hierarchical inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Multiple inheritance through interfaces
interface Pet {
    void play();
}

class PetDog extends Dog implements Pet {
    public void play() {
        System.out.println("Pet dog plays.");
    }
}

public class exp5 {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println("\nMultiple Inheritance Using Interface:");
        PetDog pd = new PetDog();
        pd.eat();
        pd.bark();
        pd.play();
    }
}
