package Array;

public class TwoSum {
    public static boolean func(int[] arr){
        int target=8;
        boolean present=false;
        for(int i:arr){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+"+"+arr[j]);
                    present=true;
                }
            }
        }
        return present;
    }


    public static void main(String[] args) {
        /* a sorted array is given sum of any two elements must be equal to the target*/
        int[] arr = {1,2,3,4,5,6,7,8,9};
        if (!func(arr)) {
            System.out.println("No sum is present");
        }

    }
}
