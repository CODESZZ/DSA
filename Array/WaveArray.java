package Array;

public class WaveArray {
/*a sorted array is given arrange in such a way that
    Input: arr[] = [1, 2, 3, 4, 5]
    Output: [2, 1, 4, 3, 5]
    * */
    public static void wave(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9,10};
        wave(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
