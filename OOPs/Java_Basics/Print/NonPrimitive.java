public class NonPrimitive {

//    public static void main(String[] args) {
//        String name = "Zeeshan";
//
//
//        System.out.println(name.getClass());
//
//
//        System.out.println(name.getClass().getName());
//    }



        public static void main(String[] args) {
            String text1= "Hello";
            String text2 = "Hello";

            
            System.out.println("Text1  memory address: " + System.identityHashCode(text1));
            System.out.println("Text2  memory address: " + System.identityHashCode(text2));
        }
    }




