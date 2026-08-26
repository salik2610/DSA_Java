class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;

        Map<Integer, Integer> ans = new HashMap<>();
        int dups = 0;

        for (int i = 0; i < k; i++) {
            if (!ans.containsKey(nums[i])) {
                ans.put(nums[i], 0);
            }
            ans.put(nums[i], ans.get(nums[i]) + 1);

            sum = sum + nums[i];

            if (ans.get(nums[i]) > 1) {
                dups++;
            }
        }
        if (dups == 0) {
            max = Math.max(max, sum);
        }

        for (int i = k; i < nums.length; i++) {
            int numToAdd = nums[i];
            int numToRemove = nums[i - k];

            if (!ans.containsKey(numToAdd)) {
                ans.put(numToAdd, 0);
            }
            ans.put(numToAdd, ans.get(numToAdd) + 1);

            if (ans.get(numToAdd) > 1) {
                dups++;
            }
            sum = sum + numToAdd;

            if (ans.get(numToRemove) > 1) {
                dups--;
            }
            ans.put(numToRemove, ans.get(numToRemove) - 1);

            sum = sum - numToRemove;

            if (dups == 0) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}