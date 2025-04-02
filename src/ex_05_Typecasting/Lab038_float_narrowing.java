package ex_05_Typecasting;

public class Lab038_float_narrowing {
    public static void main(String[] args) {
        int a=100;
        float f = a; //implicit - Narrow
        System.out.println(f);
        int both = a+(int) f; // explicit - Narrow

        float both1 = a+f; //widening - auto - implicit
        float both2 = (float) a+f; // widening - explicit
        System.out.println(both1);
        System.out.println(both2);
    }
}
