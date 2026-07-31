class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(ans.contains(nums[i])){
             return true;  
            }
            ans.add(nums[i]);
        }
        return false;
    }
}