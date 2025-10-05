package Array;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 40;
        boolean found = false;  //target is not in array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                found = true;   //target exists in array
                break; // stop once found
            }
        }

        if (!found)  System.out.println("Not found");

    }
}