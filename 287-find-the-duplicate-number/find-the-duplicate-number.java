class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        // Phase 1: cycle mein milne wala point dhoondo
        do {
            slow = nums[slow];          // 1 step
            fast = nums[nums[fast]];    // 2 steps
        } while (slow != fast);
        
        // Phase 2: cycle ka START (matlab duplicate number) dhoondo
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;   // ye hi duplicate number hai
    }
}