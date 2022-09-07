"""
LeetCode: 347. Top K Frequent Elements
NeetCode: 5/150

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
"""
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
#         count = Counter(nums)
#         tuple_list = []
#         heapq.heapify(tuple_list)
        
#         for key,val in count.items():
#             heapq.heappush(tuple_list, (-val,key))
            
#         result = [heapq.heappop(tuple_list)[1] for i in range(k)]
#         return result
        count = Counter(nums)                               #Count the each elements' appearance times
        temp = [-i for i in count.values()]                #get the value of the hashmap with negative number to create a MaxHeap
        heap = list(zip(temp,count.keys()))                #To form a heap with Pair (value,key)
        heapq.heapify(heap)                               #Transform the list to the heap
        return [heapq.heappop(heap)[1] for i in range(k)] # pop k times from the maxheap's key which is our answer
