package ex_16_Arrays;

public class Lab146_sumOfArrays {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);

        //enhanced for loop
        for(int n:a){
            sum=sum+n;
        }
        System.out.println(sum);
    }

}
