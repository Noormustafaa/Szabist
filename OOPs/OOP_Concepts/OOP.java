// Understading the concept of Object Oriented Programming (OOP) in Java

class car {

    // Attributes (Variables)
    String brand;
    String color;
     int speed;

// Method (Action)
    void drive() {
        System.out.println(brand + " Car is Driving at Speed: " + speed + " km/h");
    }



    }


public class OOP 

{



public static void main(String[] args) 
{
    
  // Creating  Object 1 

        car myCar = new car();
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.speed = 100;

        // Creating Object 2 
        car friendCar = new car();
        friendCar.brand = "Honda";
        friendCar.color = "Black";
        friendCar.speed = 120;

        // Calling the drive method for both objects
        myCar.drive();
        System.out.println();

        friendCar.drive();

}

}
