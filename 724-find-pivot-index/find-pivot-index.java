class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int totalSum = 0;
        int ans = -1;
        for(int i=0;i<n;i++){
            totalSum = totalSum+nums[i];
        }
        for(int j=0;j<n;j++){
            int rightSum = totalSum-leftSum-nums[j];
            if(leftSum==rightSum){
                return j;
            }
            else{
                leftSum = leftSum+nums[j];
            }
        }
       return -1;
    }
}