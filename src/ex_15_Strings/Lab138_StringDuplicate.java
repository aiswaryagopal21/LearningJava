package ex_15_Strings;

public class Lab138_StringDuplicate {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3="Hello";
        //there will be only one hello in string constant pool bez it doesn't allow duplicates

        String s4=new String("World");
        String s5=new String ("World");
        String s6=new String ("World");
        //there will be 3 world bez we use new here
    }
}
