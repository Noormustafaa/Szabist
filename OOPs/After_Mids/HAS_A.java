//HAS-A Relationship (Object Inside Another Class)
class Engine {
    int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void showPower() {
        System.out.println("Engine power: " + horsePower + " HP");
    }
}
class Car {
    String model;
    Engine engine; // HAS-A relationship: Car HAS-A Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void carDetails() {
        System.out.println("Car model: " + model);
        engine.showPower(); // Using the Engine object to show its power
    }
}

public class HAS_A{
    public static void main(String[] args) {
        Engine v8 = new Engine(450);
        Car mustang = new Car("Mustang", v8);
        mustang.carDetails();
    }
}



