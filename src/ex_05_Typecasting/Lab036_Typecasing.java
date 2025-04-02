package ex_05_Typecasting;

public class Lab036_Typecasing {
    public static void main(String[] args) {
        byte b=10;
        int a=b;
        //valid syntax
        //smaller data into the bigger data type
        //  Implicit -> casting -> widening
        int a1 = (int)b; // explicit casting ->    widening (doesn't require)
    }
}
