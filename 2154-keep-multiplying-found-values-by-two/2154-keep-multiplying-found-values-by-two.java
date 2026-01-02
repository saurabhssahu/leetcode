class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            numbers.add(num);
        }

        while (numbers.contains(original)) {
            original = original * 2;
        }

        return original;
        
    }
}