package ex_16_Arrays;

public class Lab151_2D_iterate {
    public static void main(String[] args) {
        int[][] num={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<num.length;i++){//num.length--> rows
            for(int j=0;j<num[i].length;j++){//num[i].length--> Column
                System.out.print(num[i][j]+" | ");//don't use println use print to get in same line
                // System.out.println(num[i][j]+"  ");
                //System.out.println("*"+" ");
            } System.out.println();
        }


    }
}
