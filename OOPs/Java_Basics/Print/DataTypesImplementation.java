public class DataTypesImplementation {
    public static void main(String[] args) {

        System.out.println("=== 1. PRIMITIVE / PRIMARY DATA TYPES ===");

        // A. Numeric -> Integer (Byte, Short, Int, Long)
        byte age = 22;                  // 1 Byte
        short year = 2026;              // 2 Bytes
        int salary = 75000;             // 4 Bytes
        long worldPopulation = 8000000000L; // 8 Bytes

        System.out.println("Byte Age: " + age);
        System.out.println("Short Year: " + year);
        System.out.println("Int Salary: " + salary);
        System.out.println("Long Population: " + worldPopulation);

        // B. Numeric -> Decimal (Float, Double)[cite: 1]
        float temperature = 36.6f;      // 4 Bytes
        double piValue = 3.1415926535;    // 8 Bytes (High precision)

        System.out.println("Float Temp: " + temperature);
        System.out.println("Double Pi: " + piValue);

        // C. Non-Numeric (Char, Boolean)[cite: 1]
        char section = 'A';             // 2 Bytes (Single quotes mein)
        boolean isPassed = true;        // 1 bit (True Or False)

        System.out.println("Char Section: " + section);
        System.out.println("Boolean Status: " + isPassed);


        System.out.println("\n=== 2. NON-PRIMITIVE / USER-DEFINED DATA TYPES ===");

        // A. String (Text store karne ke liye)
        String studentName = "Muhammad Zeeshan";
        System.out.println("String Name: " + studentName);

        // B. Array (Aik hi type ki mukhtalif values ki list)
        int[] mathScores = {85, 90, 78, 92};
        System.out.println("Array First Score: " + mathScores[0]);

        // C. User-defined Class object (Non-primitive reference type)
        DataTypesImplementation myObj = new DataTypesImplementation();
        System.out.println("Class Object Reference: " + myObj);
    }
}