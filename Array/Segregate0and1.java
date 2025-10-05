package Array;

public class Segregate0and1 {

    // Method to segregate 0s and 1s
    public static void segregate(int[] arr) {
        int count0 = 0, count1 = 0;

        // Count 0s and 1s
        for (int ele : arr) {
            if (ele == 0) count0++;
            else count1++;
        }

        // Fill 0s
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }

        // Fill 1s
        for (int i = count0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 0, 0, 0};

        segregate(arr); // Call function

        // Print segregated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
