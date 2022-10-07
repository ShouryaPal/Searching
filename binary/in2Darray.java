package binary;

import java.util.Arrays;

public class in2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1,3}};
        int target = 3;
        System.out.println(Arrays.toString(search(arr, target)) );
        
    }
    private static int[] search(int[][] arr,int target){
        int[] ans =  {-1,-1};
        int r= 0;
        int c = arr.length-1;
        while(r<arr.length&& c>=0){
            if(arr[r][c] == target){
                ans[0] = r;
                ans[1] = c;
            }
            if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return ans;
    }
}
