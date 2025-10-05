package Array;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        for(int i:arr){
//            System.out.println(i+" ");
//        }

        for(int i:arr){
            i*=2;
            System.out.println(i);
        }
        for(int i:arr) System.out.println(i);

/*
-->In the first loop, i is not the array element itself, it’s a "copy" of the value at each index.
-->So when you do i *= 2;, you are changing the copy, not the actual element in arr.
-->That’s why the array is unchanged in the second loop.
 */

    }
}
