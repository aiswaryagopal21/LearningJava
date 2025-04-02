package ex_06_Ternary_Operator;

public class Lab041_NestedTernary {
    public static void main(String[] args) {
        int num=80;
        String result = num > 400 ? (num > 500 ? "IS it is greater than 500" : "It is less than 500") : "Less than 400";
        System.out.println(result);
    }
}
