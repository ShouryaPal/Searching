package binary;


public class basic {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11};
        int[] arr2 = {9,8,7,6,5,4,3,2,1};
        int target = 3;
        System.out.println(search(arr, target));
        System.out.println(search(arr2, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean asc = arr[start]<arr[end];
    
        while(start<= end){
            
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return mid;
            if(asc){
                if(arr[mid]<target) start = mid+1;
                else if(target<arr[mid])  end = mid-1;
            }else{
                if(arr[mid]>target) start = mid+1;
                else if(target<arr[mid])  end = mid-1;
            }
            
        }
        return -1;
    }
    
}
