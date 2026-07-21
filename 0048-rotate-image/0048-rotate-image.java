class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int[] arr: matrix){
            reverse(arr);
        }
    }
    public void transpose(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<=i; j++){
                if(i==j) continue;
                swap(mat,i,j);
            }
        }
    }
    public void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}