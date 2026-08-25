class Solution {
    public int missingMultiple(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int i = 1;

        while(set.contains(k * i)) {
            i++;
        }

        return k * i;
    }
}