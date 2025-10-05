package Array;

public class SecondMaximumElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
//TO CHeCK MAX
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
//TO CHeCK SEC MAX
        for(int i=0;i<arr.length;i++){
            if((arr[i]>smax) && (arr[i]!=max)) smax=arr[i];
        }
        System.out.println("Second Maximum element is "+smax);
    }

}
