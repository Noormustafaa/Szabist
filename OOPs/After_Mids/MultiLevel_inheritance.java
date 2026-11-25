class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " barks: Woof!");
    }
}

public class MultiLevel_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.eat(); 
        d.walk();
        d.bark(); 
    }
}