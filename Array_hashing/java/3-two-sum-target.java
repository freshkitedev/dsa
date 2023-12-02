/* https://leetcode.com/problems/two-sum/ */



class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hmap = new HashMap<>();
        int val_dic;

        for (int i = 0; i < nums.length; i++) {
            val_dic = target - nums[i];
            if (hmap.containsKey(val_dic)) {
                return new int [] {i, hmap.get(val_dic)};
            }
            hmap.put(nums[i], i);
        }
        return new int [] {};
    }
}