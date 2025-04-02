package ex_06_Ternary_Operator;

public class Lab043_EvenOdd {
    public static void main(String[] args) {
        //even or odd number
        int num = 25;
        String result = (num % 2 == 0) ? "Even Number" : "Odd number";
        System.out.println(result);
    }
}
