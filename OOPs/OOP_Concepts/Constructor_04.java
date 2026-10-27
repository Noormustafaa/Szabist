// Constructor Initialization (Dynamic / Unique Values)

//A constructor gives us the freedom to pass custom, unique values to an object as soon as it is created. Each object can have different values

/*A constructor allows us to assign unique values to an 
object right at the time of creation.
 Every object can have its own distinct values. */



class Student {
    String name;
    int age;

    // Constructor (It receives and assigns values when creating an object).
    Student(String n, int a) {
        name = n;
        age = a;
    }
    
    // A method to display students' details.

    void displayInfo() {
        System.out.println("Student Name: " + name + " | Age: " + age);
    }

}


public class Constructor_04 {
    public static void main(String[] args) {
       
        //Unique values were passed for each student at the time of object creation
       // We passed unique values for each student right when creating the object
        Student s1 = new Student("Ali", 20);

        Student s2 = new Student("Sara", 22);
        
        Student s3 = new Student("Ahmed", 19);
    
        //Let's print the details of all students

        System.out.println("--- Students Information ---");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();



    }
    
}
