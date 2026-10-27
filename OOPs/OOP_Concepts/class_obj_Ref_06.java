class Student {


}

public class class_obj_Ref_06 {
    public static void main(String[] args) {
      
        Student s1 = new Student();
        Student s2 = new Student();

        Student s3 = s1; // Here S3 and s1 have same refrence 

        // method 1
        
        System.out.println("s1 = "+s1);

        System.out.println("s2 = "+s2);

        // Method2 -- identityHashCode -- this is the real refrence id 

        System.out.println("s1 refrence ID  "+System.identityHashCode(s1));

        System.out.println("s2 refrence ID  "+System.identityHashCode(s2));

        System.out.println("s3 refrence ID  "+System.identityHashCode(s3));

        // Method3- Refrence Compare ! 

        System.out.println(s1==s2);
        System.out.println(s1==s3);

    }
    
}
