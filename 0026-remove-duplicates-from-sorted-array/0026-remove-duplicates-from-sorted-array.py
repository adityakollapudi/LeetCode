class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0


        k = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:  
                nums[k] = nums[i]
                k += 1

        return k 


s = Solution()

nums1 = [1, 1, 2]
k1 = s.removeDuplicates(nums1)
print(k1, nums1[:k1])   
