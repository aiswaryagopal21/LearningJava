package ex_03_Literals;

public class Lab_019_char_Literals {
    public static void main(String[] args) {
        char a = 'A';
        char gender = 'F';
        char c = ' '; //blank space

        //escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r'; // will remove the 1st word before that

        //concatenation using +
        System.out.println("Aiswarya"+new_line+"Sidhu");
        System.out.println("Hara"+tab_line+"Juwin");
        System.out.println("Hara"+back_space+"Sidhu");
        System.out.println("aishu"+"Hara"+carriage_return+"Aishu"+"Juwin");
        System.out.println("This is 1st line\n"+"This is next line\t"+"tab");

    }
}
