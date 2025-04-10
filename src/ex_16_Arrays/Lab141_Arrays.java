package ex_16_Arrays;

public class Lab141_Arrays {
    public static void main(String[] args) {
        int a = 10;
        //2 ways to construct array
        int[] rollNum = {1, 2, 3, 4, 5};
        int[] marks = new int[5]; //index 0,1,2,3,4 //fixed size
        System.out.println(marks.length);//length
        System.out.println(marks[0] = 98);
        System.out.println(marks[1] = 97);
        System.out.println(marks[2] = 89);
        System.out.println(marks[4] = 87);
        System.out.println(marks[3] = 99);
        //System.out.println(marks[5]=100); length is 5 if I add extra java.lang.ArrayIndexOutOfBoundsException
        //int[] num= new int[-1]; - java.lang.NegativeArraySizeException
        String name[] = new String[2];
        name[0] = "Aiswarya";
        name[1] = "Sidhu";
        System.out.println(name[1]);

        boolean[] results = {true, false, true};
        System.out.println(results[1]);
        System.out.println(results.length);

        boolean[] result = new boolean[2];
        System.out.println(result[1] = true);
        System.out.println(result[0] = false);

        boolean[] res = new boolean[2];
        res[1] = true;
        res[0] = false;
    }
}
