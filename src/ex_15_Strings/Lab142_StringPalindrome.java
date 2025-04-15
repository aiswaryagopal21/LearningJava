package ex_15_Strings;
import java.util.Scanner;
public class Lab142_StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.next();//string - next
        String newName = reverseString(name);
        if(newName.equalsIgnoreCase(name)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    private static String reverseString(String name){
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        return rev;
    }
    private static String revStr(String name){
        StringBuilder sb=new StringBuilder(name);
        return sb.reverse().toString();
    }
}
