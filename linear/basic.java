package linear;

import java.util.Scanner;

/**
 * basic
 */
public class basic {

    public static void main(String[] args) {
        int[] arr = {32,45,6,35,7,8};
        Scanner sc = new Scanner(System.in);
        int k =  sc.nextInt();// target which we are finding
        System.out.println( search(arr, k));

    }
    static int search(int[] arr,int k){
        if(arr.length==0) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k) return i;//item found 
        }
        return -1;//item not found
    }
}
// time complexity : best O(1) || worst O(n)
