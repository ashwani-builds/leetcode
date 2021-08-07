from collections import defaultdict
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mappings = defaultdict(int)
        for idx,value in enumerate(nums):
            if target - value in mappings:
                return [idx , mappings[target-value]]
            mappings[value] = idx
        