"""
LeetCode: 853. Car Fleet
There are n cars going to the same destination along a one-lane road. The destination is target miles away.

You are given two integer array position and speed, both of length n, where position[i] is the position of the ith car and speed[i] is the speed of the ith car (in miles per hour).

A car can never pass another car ahead of it, but it can catch up to it and drive bumper to bumper at the same speed. The faster car will slow down to match the slower car's speed. The distance between these two cars is ignored (i.e., they are assumed to have the same position).

A car fleet is some non-empty set of cars driving at the same position and same speed. Note that a single car is also a car fleet.

If a car catches up to a car fleet right at the destination point, it will still be considered as one car fleet.

Return the number of car fleets that will arrive at the destination.
"""

class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        array_pos_speed = [[p,s,(target-p)/s] for p, s in zip(position, speed)] # [position, speed, time to reach dest]
        
        array_pos_speed.sort(reverse=True)
        stack_of_fleets = []
        
        for car in array_pos_speed:
            stack_of_fleets.append(car)
            if(len(stack_of_fleets) > 1 and stack_of_fleets[-1][2] <= stack_of_fleets[-2][2]):
                stack_of_fleets.pop()
                
            
        return len(stack_of_fleets)
        
