"""
LeetCode: 121. Best Time to Buy and Sell Stock
NeetCode: 15/150

 You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

"""

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buying_price = prices[0]
        max_profit = 0
        
        for p in prices:
            if(p < buying_price):
                buying_price = p
            max_profit = max(max_profit, p - buying_price)
            
        return max_profit
