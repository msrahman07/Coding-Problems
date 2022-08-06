"""
A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
steps at a time. Implement a method to count how many possible ways the child can run up the
stairs.
"""

def TripleSteps(n):
    memo = [-1]*(n+1)
    return countSteps(n, memo)

def countSteps(n:int, memo:list):
    if(n < 0):
        return 0
    elif(n == 0):
        return 1
    elif(memo[n] > -1):
        return memo[n]
    else:
        memo[n] = countSteps(n-1, memo) + countSteps(n-2, memo) + countSteps(n-3, memo)
        return memo[n]

if __name__ == '__main__':
    print(TripleSteps(10))