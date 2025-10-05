package Array;

public class RotateArray {
    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d%=n;   //to handle if k>n
// Right rotation by d
        reverse(arr, 0, n - 1);   // reverse whole array
        reverse(arr, 0, d - 1);   // reverse first k elements
        reverse(arr, d, n - 1);   // reverse the rest
    }
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d%=n;   //to handle if k>n
// Left rotation by d
        reverse(arr, 0, d - 1);   // reverse first k elements
        reverse(arr, d, n - 1);   // reverse the rest
        reverse(arr, 0, n - 1);   // reverse whole array
    }

//FUNCTION TO REVERSE
    public static void reverse(int[] arr,int i,int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        int d=7;
        rotateRight(arr,d);
        System.out.print("right rotation: ");
        for(int k:arr) System.out.print(k+" ");

        System.out.println();

        rotateLeft(arr2,d);
        System.out.print("Left rotation: ");
        for(int k:arr2) System.out.print(k+" ");
    }
}
