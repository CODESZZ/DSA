package Array;

public class Segregate0and1_pointerMethod {
        public static void segregate(int[] arr) {
            int i=0;
            int j=arr.length-1;
            while(i<j){
                if(arr[i]==0) i++;
                else if(arr[j]==1) j--;
                else if(arr[i]==1 && arr[j]==0){
                    arr[i]=0;
                    arr[j]=1;

                }
            }
        }
    public static void main(String[] args) {

        int[] arr={0,1,0,1,0,1};
        segregate(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

