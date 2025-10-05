package Array;

public class MaximumMinimumElement {
    public static void main(String[] args) {
        int[] arr={10,4,9,6,7};
        int max=arr[0];         // int max=Integer.MIN_VALUE

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element "+max);


        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];

        }
        System.out.println("Smallest element "+min);

    }
}
