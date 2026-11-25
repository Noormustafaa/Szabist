class Animal {
     String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // calls the Animal constructor
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.eat();       // inherited from Animal -> Rex is eating.
        d.makeSound(); // overridden in Dog    -> Rex barks: Woof!
        d.fetch();     // unique to Dog        -> Rex is fetching the ball.
    }
}