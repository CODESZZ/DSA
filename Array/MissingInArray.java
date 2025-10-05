package Array;


public class MissingInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        long n=arr.length+1; //1 number is missing so,+1
        long sum=n*(n+1)/2;
        long arrSum=0;
        for(long i:arr) arrSum+=i;

        System.out.println("Missing num is "+ (sum-arrSum));
    }



}
