public class CoinChangeII {
    class Solution {
        public int change(int amount, int[] coins) {
            int[][] cacheMap = new int[amount+1][coins.length];
            
            return makeChange(amount, coins, 0, cacheMap);
        }
        int makeChange(int amount, int[] coins, int index, int[][] cacheMap) {
            if(cacheMap[amount][index] > 0) {
                return cacheMap[amount][index];
            }
            if(index == coins.length -1) return 1;
            else if(index > coins.length -1) return -1;
            int coinAmount = coins[index];
            int ways = 0;
    
            for(int i=1; i*coinAmount <= amount; i++) {
                int amountRemaining = amount - i*coinAmount;
                ways += makeChange(amountRemaining, coins, index+1, cacheMap);
            }    
            cacheMap[amount][index] = ways;
            return ways;
        }
    }
}
