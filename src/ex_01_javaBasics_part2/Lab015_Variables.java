package ex_01_javaBasics_part2;

public class Lab015_Variables {
    public static void main(String[] args) {
        byte b=10;
        b=12;
        System.out.println(b);
        byte age=122;
        age=122-22;
        System.out.println(age);
        //int enum=11; //not allowed bez it is a keyword
        int Enum=11; //capital E can be used
        System.out.println(Enum);
        //byte c=128; // not possible limit reached -128 to 127 only accepted
        int c=128;
        System.out.println(c);
        //int p=7639174401; // it is long so not possible
        long p=7639174401l; //l significance of "l" is long

    }
}
