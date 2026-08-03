class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> count = new HashMap<>();
        
        // increase count for each letter in s
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // decrease count for each letter in t
        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) - 1);
        }
        
        // check if everything cancelled out to 0
        for (int value : count.values()) {
            if (value != 0) {
                return false;
            }
        }
        
        return true;
    }
}