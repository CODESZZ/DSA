package Array;

import java.util.Arrays;

public class ShallowcopyDeepcopy {
    public static void main(String[] args) {
    //SHALLOW COPY
        int[] arr={10,20,30,40};
        int[]x=arr;
        x[0]=100;
        System.out.println(arr[0]); //changed
        System.out.println(x[0]);

    //DEEP COPY
        int[] arr1={10,20,30,40};
        int[] z=new int[4];
        // 0R
        // int[] z= Arrays.copyOf(arr1,arr1.length);
        z[0]=99;
        System.out.println(arr1[0]);    //unchanged
        System.out.println(z[0]);

    }
}
