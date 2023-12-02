/* https://leetcode.com/problems/valid-anagram/ */


class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char val =  s.charAt(i);
            if (hmap.containsKey(val)) {
                Integer hval = hmap.get(val);
                hval++;
                hmap.put(val, hval);
            } else {
                hmap.put(val, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char val = t.charAt(i);
            if (hmap.containsKey(val)) {
                Integer hval = hmap.get(val);
                hval--;
                hmap.put(val, hval);
            } else {
                return false;
            }
        }

        for (Map.Entry <Character, Integer> entry: hmap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}