package ex_16_Arrays;

import java.util.Arrays;

public class Lab142_traverse {
    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println(marks.length);
        marks[0]=300;
        marks[1]=400;
        marks[2]=100;
        marks[3]=200;
        marks[4]=500;
        Arrays.sort(marks);//order
        for(int i=0; i<=marks.length-1;i++){
            System.out.println(marks[i]);
        }
    }
}
