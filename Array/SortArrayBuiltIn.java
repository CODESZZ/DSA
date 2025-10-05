package Array;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {10, -9, 7, 0, -5, -1};

        Arrays.sort(arr);
        print(arr);
    }
        static void print(int[] arr){
            for (int j : arr) {
                System.out.print(j + " ");
            }
        }

}
