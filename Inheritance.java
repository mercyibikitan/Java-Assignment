// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}