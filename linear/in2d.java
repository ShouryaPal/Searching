package linear;

public class in2d {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int k = 2;
        System.out.println(search(arr,k));
    }
    static boolean search(int[][] arr, int k){
        if(arr.length==0) return false;
        for(int i = 0 ; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==k) return true;
            }
        }
        return false;
    }
}
