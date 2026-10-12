class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Parameterized_Constructor_02 {
    public static void main(String[] args) {
        // Object 1
        Student s1 = new Student("Ali", 20);

        // Object 2 
        Student s2 = new Student("Sara", 22);

        // Details print
        s1.displayInfo();
        s2.displayInfo();
    }
}