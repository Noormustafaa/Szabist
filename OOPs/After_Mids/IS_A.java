class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " car is starting zoo zoo.");
    }
}

// Single Inheritance: Car IS-A Vehicle
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    public void honk() {
        System.out.println(brand + " horn is ringing: Peep Peep!");
    }
}



public class IS_A {
    

public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start(); 
        myCar.honk();  
    }


}
