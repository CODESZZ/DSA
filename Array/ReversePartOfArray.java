package Array;

public class ReversePartOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 1, 8, 9};
        int i = 3, j = 5;       //just change here

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for(int k:arr) System.out.print(k+" ");
    }
}
