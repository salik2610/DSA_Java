class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int len=0;
        int i=0;
        Set<Character>set=new HashSet<>();
        for(int j=0;j<n;j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            len=Math.max(len,j-i+1);
        }
        return len;
    }
}