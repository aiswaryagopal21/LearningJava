package ex_15_Strings;

public class Lab141_StringBuilderVSStringBuffer {
    public static void main(String[] args) {
        String s1="Aiswarya";//SCP
        String s2=new String("Aiswarya");//OA
        //use append instead of concat in string buffer and string builder
        StringBuffer sb=new StringBuffer("Aiswarya");//OA
        //string buffer is mutable so "Aiswarya" is deleted and only "AiswaryaSidhu" will be present
        System.out.println(sb.append("Sidhu"));
        System.out.println(sb.reverse());

        String s3="Hello";
        String s4="World";
        String s5=s3+s4;
        System.out.println(s5);//3 strings will be created

        StringBuilder su=new StringBuilder("Aiswarya");//OA
        //string buffer is mutable so "Aiswarya" is deleted and only "AiswaryaSidhu" will be present
        System.out.println(su.append("Sidhu"));
        System.out.println(su.reverse());
        su.delete(2,4);
        su.replace(1,4,"c++");
        System.out.println(su);
    }

}
