package ex_16_Arrays;

public class Lab150_2DArray {
    public static void main(String[] args) {
        //1,2,3
        //4,5,6
        //7,8,9
        // 3 rows, 3 columns
        int[][] array_2d_old = {{1,2,3},{4,5,6},{7,8,9}};
      /*  int [][] array_2d={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }
        //we can also put like this for understanding purpose
       */
        int[][] array_2d = new int[3][3];
        array_2d[0][0]=1;
        array_2d[0][1]=2;
        array_2d[0][2]=3;
        array_2d[1][0]=4;
        array_2d[1][1]=5;
        array_2d[1][2]=6;
        array_2d[2][0]=7;
        array_2d[2][1]=8;
        array_2d[2][2]=9;
        /*
            0,0	    1
            0,1	    2
            0,2	    3
            1,0	    4
            1,1	    5
            1,2	    6
            2,0	    7
            2,1	    8
            2,2	    9

         */

        int[][] arrayrows=new int[][] {{1,2},{3,4},{5,6}};
        //1,2
        //3,4
        //5,6   -> 3 rows, 2 columns

        //Jagged array - each row different different
        int[][] jaggedArray=new int[][] {
                {1,2,3},
                {4,5},
                {6},
                {7,8,9}
        };
    }
}
