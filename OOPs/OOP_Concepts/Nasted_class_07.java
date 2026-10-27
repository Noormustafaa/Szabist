class A {
    class B{

        void show(){
            System.out.println("Iam Nasted Class B ");

        }


    }

}

// Note for creating inner class object , outer class object is very much important !

public class Nasted_class_07 {

    public static void main(String[] args) {
        
        A Outer = new A(); // first creating the outer class object

        A.B obj1= Outer.new B();

        obj1.show();



    }
    
}
