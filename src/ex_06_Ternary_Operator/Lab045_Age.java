package ex_06_Ternary_Operator;

public class Lab045_Age {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user
        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);

        String result = (age < 18) ? "Minor" : (age>18) ? "Major" : "Senior";
        System.out.println(result);
        /*  click on the class name on the top -> edit configuration ->
        *   in program arguments give the number -> ok
        */
    }
}
