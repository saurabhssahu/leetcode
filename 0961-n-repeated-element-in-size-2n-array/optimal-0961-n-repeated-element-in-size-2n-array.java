/*
Optimal O(1) Space Solution
The key insight is that the repeated element must appear at least twice within any subarray of length 4.
This means you only need to check elements that are 1, 2, or 3 positions away from the current index.
 */

class Solution {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) {
                return nums[i];
            }
        }
        // If not found in the loop, the repeated element must be the last element
        // (due to the problem constraints).
        return nums[nums.length - 1];
    }
}
