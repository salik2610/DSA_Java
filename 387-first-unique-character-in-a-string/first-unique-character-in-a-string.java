class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> ans = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            ans.put(c, ans.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ans.get(c) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}