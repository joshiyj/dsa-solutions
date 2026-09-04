class Solution {
    int five = 0;
    int ten = 0;
    int twenty = 0;

    public boolean lemonadeChange(int[] bills) {
        for(int i=0; i<bills.length; i++){
            int rem = bills[i] - 5;
            rem = choose(rem,20, twenty);
            rem = choose(rem,10, ten);
            rem = choose(rem,5, five);

            if(rem > 0) return false;
            if(bills[i]==5){
                five++;
            } else if(bills[i]==10){
                ten++;
            } else {
                twenty++;
            }
        }
        return true;
    }
    public int choose(int rem, int bill, int avl){
        int cnt = rem/bill;
        if(cnt<=avl){
            rem -= cnt*bill;
            if(bill==5){
                five -= cnt;
            } else if(bill==10){
                ten -= cnt;
            } else {
                twenty -= cnt;
            }
        } else {
            rem -= avl*bill;
            if(bill==5){
                five -= avl;
            } else if(bill==10){
                ten -= avl;
            } else {
                twenty -= avl;
            }
        }
        return rem;
    }
}