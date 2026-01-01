class Solution {
    public int[] plusOne(int[] digits) {

        int i = digits.length-1;
        boolean flag = true;

        do {

            digits[i] = digits[i] + 1;

            if (digits[i] == 10) {
                if (i==0) {
                    int[] result = new int[digits.length + 1];
                    result[i] = 1;
                    return result;
                }

                digits[i] = 0;
                i--;
            } else {
                flag = false;
            }

        } while (flag);
        return digits;
    }
}