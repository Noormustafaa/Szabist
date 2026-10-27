class A{

    static class B{

        void show()
        {

            System.out.println("Iam static nasted class ");

        }

    }



}


public class Nasted_class_08 {
    public static void main(String[] args) {

    A.B obj1 = new A.B();
    obj1.show();    
    
    
    }
}
