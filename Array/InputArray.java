package Array;

import java.util.Scanner;


public class InputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];    //array initialization

    //input
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    //output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
