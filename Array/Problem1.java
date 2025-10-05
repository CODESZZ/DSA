package Array;


//MULTIPLY ODD INDEXED ELEMENTS BY 2 AND ADD 10 TO EVEN INDEXED ELEMENTS
public class Problem1 {
    public static void main(String[] args) {

        int[] arr={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            if(i%2==0) System.out.print(arr[i]+10+" ");
            else System.out.print(arr[i]*2+" ");
        }


    }


}
