package ex_05_Typecasting;

public class Lab037_Long_Narrowing {
    public static void main(String[] args) {
        long p = 763917443434L;
        short s = (short) p; //explicit casting - narrowing
        System.out.println(s);
    }
}
