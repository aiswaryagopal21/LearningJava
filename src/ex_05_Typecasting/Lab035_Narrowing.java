package ex_05_Typecasting;

public class Lab035_Narrowing {
    public static void main(String[] args) {
        int a=100;
        //byte b=a; invalid - Narrowing - Implicit casting is not allowed
        byte b = (byte) a; // Valid - Narrowing - Explicit casting - Allowed
        //Data loss
        System.out.println(b);
    }
}
