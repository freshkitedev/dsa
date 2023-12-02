/* https://leetcode.com/problems/group-anagrams/ */


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <List<Integer>, List<String>> hmap = new HashMap<>();
        

        for (String word: strs) {
            Integer [] count = new Integer[26];
            char [] carr = word.toCharArray();
            Arrays.fill(count, 0);

            for (char c: carr) {
                count[(int)c - (int)'a'] += 1;
            }

            //List <Integer> li = Arrays.stream(count).boxed().collect(Collectors.toList());
            List <Integer> li = Arrays.asList(count);

            if (!hmap.containsKey(li)) {
                hmap.put(li, new ArrayList<>());
            }
            hmap.get(li).add(word);
        }
        return new ArrayList<>(hmap.values());
    }
}