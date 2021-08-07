import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <  nums.length; i++) {

            int rem_target = target - nums[i];
            if (map.containsKey(rem_target)) {
                return new int[]{i, map.get(rem_target)};
            }
            map.put(nums[i], i);
        }
        return new int[0];
         
    }
}