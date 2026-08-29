class Solution {
    public int coinChange(int[] coins, int amount) {
        int pd[] = new int[amount+1];
        Arrays.fill(pd,amount+1);
        pd[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(coin<=i){
                    pd[i]=Math.min(pd[i],pd[i-coin]+1);
                }
            }
        }
        return pd[amount]>amount?-1:pd[amount];
    }
}