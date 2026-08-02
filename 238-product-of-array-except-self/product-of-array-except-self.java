class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] answer = new int[n];
        
        // Base cases
        leftProduct[0] = 1;
        rightProduct[n-1] = 1;
        
        // Fill leftProduct: left to right
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
        }
        
        // Fill rightProduct: right to left
        for (int j = n-2; j >= 0; j--) {
            rightProduct[j] = rightProduct[j+1] * nums[j+1];
        }
        
        // Combine
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct[i] * rightProduct[i];
        }
        
        return answer;
    }
}