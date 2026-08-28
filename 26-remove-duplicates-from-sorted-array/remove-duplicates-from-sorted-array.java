class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left =0;
        for(int i=1;i<n;i++){
            if(nums[left]!=nums[i]){
                left++;
                nums[left]=nums[i];
            }
        }
        return left+1;
    }
}