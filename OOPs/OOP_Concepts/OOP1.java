// Understading the concept of Object Oriented Programming (OOP) in Java
class car {
    // Attributes (Variables) OR // Fields OR  // Instance variables
    //member variables 
    String brand;
    String color;
    int speed;

// Method (Action)
// Member method 
    void drive() {
        System.out.println(brand + "Car is Driving at Speed: " + speed + " km/h");
    }

 }


public class OOP1 {
public static void main(String[] args) 
{
    
  // Creating  Object 1 

        car ToyotayCar = new car();
        ToyotayCar.brand = "Toyota";
        ToyotayCar.color = "Red";
       ToyotayCar.speed = 100;

        // Creating Object 2 
        car friendCar = new car();
        friendCar.brand = "Honda";
        friendCar.color = "Black";
        friendCar.speed = 120;
        // Calling the drive method for both objects
        ToyotayCar.drive();

        

        friendCar.drive();

}

}
