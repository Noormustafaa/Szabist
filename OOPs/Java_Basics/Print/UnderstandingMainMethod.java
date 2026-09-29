import java.util.Scanner;

public class UnderstandingMainMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Your_Name: ");
        String name = input.nextLine();

        System.out.print("Write Your city Name : ");
        String city = input.nextLine();


        System.out.println("\n--- Result ---");
        System.out.println("Welcome, " + name + "!");
        System.out.println("YOur  CIty " + city + " .");
    }
}