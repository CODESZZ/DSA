package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={10,5,6,3,2,1,8,9};
        int i=0, j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;j--;
        }

//int n=arr.length;
//for(i=0;i<n/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-i-1];
//            arr[n-i-1]=temp;
//}


        for(int k:arr) System.out.print(k+" ");


    }
}
