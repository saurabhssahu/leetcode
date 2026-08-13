import java.util.*;

class Solution {
    public int missingInteger(int[] nums) {
        
        int result = nums[0];

        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] == 1) {
                result += nums[i+1];
            } else {
                break;
            }
        }


        boolean found = true;

        while (found) {
            found = false;
            for (int x : nums) {
                if (x == result) {
                    result++;    // Safely incremented
                    found = true;// Triggers the loop to check the array again
                    break;       // Optimization: stop checking the rest of the array
                }
            }
        }

        return result;
        
    }
}