// Here we have given an array and given a range if element present in it than true otherwise false

package linear;

public class inRange {
    public static void main(String[] args) {
        int[] arr = {1,-2,4,6,5,9,11};
        int start = 2;
        int end = 6;
        int k = 5;
        System.out.println(search(arr,k,start,end));
    }
    static boolean search(int[] arr, int k , int start,int end){
        if(end > arr.length) return false;
        for(int i=start;i<=end;i++){
            if(arr[i]==k) return true;
        }
        return false;
    }
}
