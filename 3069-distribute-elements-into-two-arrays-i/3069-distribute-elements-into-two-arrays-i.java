class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int x = 0, y = 0;

        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(x) > arr2.get(y)) {
                arr1.add(nums[i]);
                x++;
            } else {
                arr2.add(nums[i]);
                y++;
            }
        }

        return Stream.concat(arr1.stream(), arr2.stream())
                        .mapToInt(Integer::intValue)
                        .toArray();
    }
}