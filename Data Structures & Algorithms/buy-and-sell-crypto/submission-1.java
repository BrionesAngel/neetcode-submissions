class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int max=0;
        int l=0;
        int r=1;
        while(r<prices.length) {
            if(prices[r]<prices[l]){
                l=r;
                r++;
            }
            if(r<prices.length) max=Math.max(max, prices[r]-prices[l]);
            r++;
        }
        return max;
    }
}
