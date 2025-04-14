package ex_16_Arrays;

import java.util.Scanner;

public class Lab144_userInputarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an arrays(int)");
        int size = sc.nextInt();

        int[] marks = new int[size];
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the numbers");
            marks[i] = sc.nextInt();

        }
        System.out.println("---------------------------------------");

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        sc.close();

    }
}
