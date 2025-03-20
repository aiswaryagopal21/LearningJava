package ex_04_Operators;

public class Lab029_ORgate {
    public static void main(String[] args) {
        int salary = 1000;
        boolean b = !(salary >2000 || salary<1500);
        System.out.println(b);
    }
}
