public class BasicFunctions {

    // 1. Function WITHOUT parameters and WITHOUT return type (void)
    public static void sayHello() {
        System.out.println("Hello! Function Without parameters.");
    }

    // 2. Function WITH parameters (And Without Return Type)
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Function with Parameter.");
    }

    // 3. Function WITH parameters and WITH return type (int)
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; //
    }

    public static void main(String[] args) {
       // Function Calling !
        sayHello();


        // --- Type 2 Function call  (WIth parameter) ---
        greetUser("Ali");

        // --- Type 3 Function call  ---
        // int result = addNumbers(10, 20);
        // System.out.println("The sum Of Two numbers Is !: " + result);

        // Or We can Also Print Like This !
        System.out.println(" Without Using Any Variable !  "+addNumbers(22,10));
    }
}