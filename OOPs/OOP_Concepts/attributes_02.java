class Student {
    // Direct Initialization (For All objects this name will remain common )

    String schoolName = "ABC High School";
    
    // Student name , here we can assign individualy 

    String name;

}


public class attributes_02 {
public static void main(String[] args) {

        // Creating  Object for  Student1 

        Student s1 = new Student();
        s1.name = "Ali";

        //Creating Object For Student2

        Student s2 = new Student();
        s2.name = "Sara";

        // First, we will check the school name of both.

        System.out.println("--- Initial School Names ---");
        

        System.out.println(s1.name + " goes to: " + s1.schoolName);

        System.out.println(s2.name + " goes to: " + s2.schoolName);

       // If we only want to change Ali's school (if it needs to be changed later).

       s1.schoolName = "XYZ Public School";

       System.out.println("\n--- After Changing Ali's School ---");

       System.out.println(s1.name + " goes to: " + s1.schoolName);

       System.out.println(s2.name + " goes to: " + s2.schoolName); // Still Sara's School name is Same.


    
}
}
