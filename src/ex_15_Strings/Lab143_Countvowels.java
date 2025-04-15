package ex_15_Strings;

public class Lab143_Countvowels {
    public static void main(String[] args) {
        String input = "My name is Aiswarya Gopal";
        int vowels = 0;
        int consonants = 0;

        input= input.toLowerCase();
        System.out.println(input);

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if( ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Total number of vowels in the sentence: "+vowels);
        System.out.println("Total number of consonants in the sentence: "+consonants);
    }
}
