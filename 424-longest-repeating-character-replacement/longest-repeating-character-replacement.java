class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0;
        int maxFreq=0;
        int j=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,map.get(ch));

            while((i-j+1)-maxFreq>k){
                char leftChar= s.charAt(j);
                map.put(leftChar,map.getOrDefault(leftChar,0)-1);
                j++;
            }
            maxLen=Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }
}