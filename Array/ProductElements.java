package Array;

import java.util.Scanner;

public class ProductElements {
    public static void main(String[] args) {
        int prod=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //PRODUCT
        for (int i=0;i<n;i++){
            prod*=arr[i];
        }
        System.out.println("product: "+prod);



    }
}
