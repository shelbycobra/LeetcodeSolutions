import sys

def maxSubArray(nums):
    maxSum = nums[0]
    # bruteforce

    for i in range(1, len(nums)):
        nums[i] = max(nums[i], nums[i] + nums[i-1])

        maxSum = max(maxSum, nums[i])

    return maxSum

print(maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))