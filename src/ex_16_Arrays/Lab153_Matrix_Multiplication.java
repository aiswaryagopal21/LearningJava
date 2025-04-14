package ex_16_Arrays;

import java.util.Scanner;

public class Lab153_Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int num = sc.nextInt();
        //i*j 0*0,0*1,0*2,1*0,1*1,1*2,2*0,2*1,2*2
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print(i+"x"+j+"="+(i*j)+"\t\t");//\t tab
                //System.out.print((i*j)+"\t\t");
            }
            System.out.println();
        }
    }
}
