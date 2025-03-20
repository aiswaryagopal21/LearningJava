package ex_04_Operators;

public class Lab024_ModulusOperator {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        System.out.println(a%b);
        //a % b means "divide 20 by 10 and return the remainder
        //20 ÷ 10 = 2 (a perfect division, no remainder)
        //The remainder is 0, so the result of a % b is 0.
        //        10 | 20 |  2 - Quoinet
        //           | 20 |
        //           -------
        //             0 - Remainder
        //           ----

        int a1=22;
        int b1=10;
        System.out.println(a1%b1);
    }
}
