class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        output =[]
        
        for i in range(0,len(nums)):
            for j in range(1 , len(nums)):
                if((nums[i] + nums[j]) == target):
                    return [i,j]
                
        return []
