class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];

        for(int i=0; i<piles.length; i++){
            high = Math.max(piles[i],high);
        }
        
        while(low<high){
            int mid = low + (high-low)/2;
            int hrs = isValid(piles,mid);
            if(hrs<=h){
                high = mid;
            } else{
                low = mid+1;
            }
        }
        return high;
    }
    public static int isValid(int[] arr, int speed){
        int hrs = 0;
        for(int i=0; i<arr.length; i++){
            hrs += (int) Math.ceil(arr[i]/(double) speed);
        }
        return hrs;
    }
}