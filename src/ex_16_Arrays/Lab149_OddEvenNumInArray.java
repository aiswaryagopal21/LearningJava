package ex_16_Arrays;

public class Lab149_OddEvenNumInArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("even numbers are: ");
        for (int n : num) {
            if (n % 2 == 0) {
                System.out.println(n + " ");

            }
        }
        System.out.println("Odd numbers are: ");
        for (int n1 : num) {
            {
                if (n1 % 2 != 0) {
                    System.out.println(n1 + " ");
                }
            }

        }
    }
}
