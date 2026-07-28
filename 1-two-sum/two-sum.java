class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ans = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int need = target-nums[i];
            if(ans.containsKey(need)){
                return new int[]{ans.get(need),i};
            }
            ans.put(nums[i],i);
        }
        int[] ans1 ={};
        return ans1;
    }
}