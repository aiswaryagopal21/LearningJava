package ex_15_Strings;

public class Lab139_StringEquals {
    public static void main(String[] args) {
        String s1="Hello";
        String s4="Hello";
        //SCP so only 1 Hello
        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("hello");
        //Heap Area so 3 Hello
        //== ->Comparison but in String this check location
        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s5);

        //to check the content use equals
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        System.out.println(str1==str2);;
        System.out.println(str1==str3);;
        System.out.println(str1.equals(str3));
    }
}
