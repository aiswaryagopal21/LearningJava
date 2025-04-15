package ex_15_Strings;

import java.util.Scanner;

public class Lab144_Trianglecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side1");
        int side1 = sc.nextInt();
        System.out.println("Side2");
        int side2 = sc.nextInt();
        System.out.println("Side3");
        int side3 = sc.nextInt();

        if(side1 <= 0 || side2 <= 0 || side3<= 0){
            System.out.println("It is not a Triangle");
            System.exit(0);
        }

        if(side1+side2 <= side3 || side2+side3 <= side1 || side3+side1 <= side2){
            System.out.println("This is not a Triangle");
            System.exit(0);
        }

        //Real Logic before all are edge cases
        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral triangle");
        } else if(side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("Isosceles triangle");
        }else{
            System.out.println("Scalene");
        }
    }
}
