class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
            }

        Map<Character,Integer> ans = new HashMap<>();
        for(char c:s.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
         for(char c:t.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)-1);
        }
        for(int val:ans.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}