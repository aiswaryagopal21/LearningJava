package ex_04_Operators;

public class Lab025_relational_operator {
    public static void main(String[] args) {
        /* Relational Operator
        > greater than
        < less than
        >= greater than or equal to
        <= less than or equal to
        == equal to
        !- not equal to
        // All of them will result boolean output
         */

        int a=10;
        int b=274;
        boolean c = a>b;
        System.out.println(c);

        int age = 20;
        int age2 = 30;
        boolean elder = age2>age;
        System.out.println(elder);

        System.out.println(10 == 23);
        System.out.println(23 >= 55);
        System.out.println(45 > 78);
        System.out.println(44 != 45);

        System.out.println(!(10>20));

    }
}
