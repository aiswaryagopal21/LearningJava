package ex_16_Arrays;

import java.util.Arrays;

public class Lab147_secondElementInArray {
    public static void main(String[] args) {
        int num[] = {2,3,2,45,66,3};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
