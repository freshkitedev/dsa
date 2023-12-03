class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        arr = [1] * len(nums)

        for i in range(1, len(nums)):
            arr[i] = nums[i-1] * arr[i-1]
        
        r = 1
        for i in range(len(arr) - 1, -1, -1):
            arr[i] = r * arr[i]
            r *= nums[i]
        
        return arr