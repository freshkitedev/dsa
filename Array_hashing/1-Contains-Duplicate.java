/* https://leetcode.com/problems/contains-duplicate/ */


class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Boolean> hmap = new HashMap<>();
        
        for (int val:nums) {
            if (hmap.containsKey(val)) {
                return true;
            }
            hmap.put(val, true);
        }
        return false;
    }
}