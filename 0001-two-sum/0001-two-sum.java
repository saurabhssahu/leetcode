class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> results = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (results.containsKey(complement)) {
                return new int[] { results.get(complement), i };
            }

            results.put(nums[i], i);
        }
        return new int[] {0, 1};
    }
}