public class DataTypes {

    public static void main(String[] args) {
        //DataTypes:
        // Types Of DataTypes: Primitive and Non-Primitive !

        //They are called primitive because they are built directly into the core of the Java language by the
        //creators, rather than being created by programmers using classes and objects
        //Java has 8 primitive data types, but here are the 4 most
        //commonly used ones with simple everyday examples:


        //int (for whole numbers)

        // What it does: Stores whole numbers (no decimals).

        //   Example: int age = 22;

        //double (for decimal numbers)

        //What it does: Stores numbers with fractions or decimals.

        //Example: double price = 199.99;


        // boolean (for yes/no or true/false)

        //  What it does: Stores only two possible values: true or false.

        //     Example: boolean isRaining = false;

        // char (for a single letter)

        //What it does: Stores one single character, enclosed in single quotes.

        //    Example: char grade = 'A';

        //(It holds just one letter or symbol).

        // What is a Non-Primitive Data Type in Java?
        //Definition
        // ion:
        //  A non-primitive data type (often called a reference data type) is a complex data structure that refers to an object. Unlike primitive types—which store a single, raw value directly in memory—non-primitive types store a memory
        //  address (reference) that points to where the actual data or object is stored.



        //1. Memory Storage (Value vs. Address)
       // Primitive Types: Store the actual raw value directly inside their memory box.

       // Example: int x = 10; means the box literally holds the number 10.
        //Reference Types: Store a memory address (pointer) that directs Java to where the actual object lives elsewhere in memory.

         //       Example: String name = "Ali"; means the variable holds an address pointing to where the letters "A", "l", and "i" are saved.




        //2. Built-in Methods (Actions vs. Pure Data)
      //  Primitive Types: Cannot perform actions. They are just raw numbers or flags. You cannot call methods on them.

        //Example: Trying to write int age = 22; age.toUpperCase();
        //will cause a compilation error because a number doesn't have behaviors.



        //Reference Types: Come with powerful built-in methods (actions/tools) because they are objects.

       // Example: String text = "java"; allows you to write text.toUpperCase(), which instantly transforms the text into "JAVA".

       // 3. Nullability (Can they be empty?)
       // Primitive Types: Never null. They must always hold a valid default value
       //         (like 0 for numbers or false for booleans). They cannot be left completely empty.

        //Reference Types: Can be null.
          //      A reference variable can point to nothing at all by assigning it the value null.

        // --- Primitive Behavior (Independent Copies) ---
        int scoreA = 50;
        int scoreB = scoreA; // Copies the value (50)
        scoreB = 80;         // Changing scoreB does NOT affect scoreA
// scoreA is still 50!

// --- Reference Behavior (Shared Address) ---
        int[] arrayA = {1, 2, 3};
        int[] arrayB = arrayA; // Copies the MEMORY ADDRESS, not the data
        arrayB[0] = 99;        // Changing arrayB also changes arrayA!
// arrayA[0] is now 99 because both point to the exact same array in memory.


    }


}



