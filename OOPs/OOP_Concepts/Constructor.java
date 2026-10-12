/*What is a Constructor and Why Do We Use It?
What it is: A constructor is a special method inside a class that is automatically executed (called) the exact moment an object of that class is created using the new keyword.
 */

/*Why we use it: We use constructors primarily to initialize object attributes (assign initial values to variables) right when the object is born. Instead of setting each variable line-by-line afterward, a constructor lets us pass those values upfront, making our code cleaner, safer, and much more efficient.
     */

//3 Key Features of a Constructor:

//Its name is exactly the same as the class name.

//It does not have any return type (not even void or int).

//When you write new Car(), it runs automatically.

//Default_Constructor 

class Student {
    String name;
    int age;

    // 1. Default Constructor (No parameters inside parentheses)
    Student() {
        // Hum initial/default values yahan set kar rahe hain
        name = "Unknown";
        age = 0;
        System.out.println("Hello Iam Default Constructor!");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Constructor will execute while creating an object 
        Student s1 = new Student(); 

        // Output 
        s1.displayInfo();
    }
}
