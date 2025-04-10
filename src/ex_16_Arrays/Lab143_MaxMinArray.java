package ex_16_Arrays;

public class Lab143_MaxMinArray {//class is the blur print of the program
    public static void main(String[] args) {
        /*Entry point of the program. The main method where the program starts executing
        String[] args - command line arguments can be passed while running the program*/
        int[] array1 = {12,34,3,45,66,335,678,534,6666};//Declared an integer array with predefined values
        int max_output = max_array(array1);
        /*Calls the max_array method with array1 as arguments.
        the max num is returned and stored in the max_output variable*/
        int min_output = min_array(array1);
        /*Calls the min_array method with array1 as arguments.
        The min num is returned and stored in the min_output variable         */
        System.out.println(max_output);//prints max num of array in console
        System.out.println(min_output);//prints mix value of array in console
    }
    static int max_array(int[] array1){
        int max=array1[0];
        for(int i=0;i<array1.length;i++){
            if(array1[i]>max){
                max=array1[i];
            }
        }

        return max;
    }

    static int min_array(int[] array1){
        /* Declare the static method min_array that takes the integer array array1 as input
            and returns the max num in the array */
        int min = array1[0];//initialize the variable min with the first element of the array
        for(int i=0;i<array1.length;i++){
            /*use a loop to traverse through all the elements in an array
            array1.length gives the total num of elements in an array */
            if(array1[i]<min){//checks if the current element is lesser than the current min
                min=array1[i];//if the condition is true updates the min with current element
            }//closes if block
        }//closes for loop
        return min;//returns the min num of the calling method
    }

}
