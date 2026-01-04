class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            // Check if the number has exactly four divisors and add the sum if it does
            ans += findSumIfFourDivisors(num);
        }
        return ans;
    }

    private int findSumIfFourDivisors(int x) {
        // Start count at 2 for the default divisors 1 and x
        int count = 2;
        // Start sum at x + 1 ex: 21 then 22 and 1 are by default divisors so 22+1
        int sum = x + 1;
        // Iterate from 2 up to the square root of x
        for (int i = 2; i <= x / i; ++i) {
            if (x % i == 0) {
                // Found a divisor i
                count++;
                sum += i;
                // If i * i != x, then x/i is a distinct divisor
                if (i * i != x) {
                    count++;
                    sum += x / i;
                }
                // If we find more than 4 divisors, we can stop and return 0
                if (count > 4) {
                    return 0;
                }
            }
        }
        // If the final count is exactly 4, return the sum; otherwise, return 0
        return count == 4 ? sum : 0;
    }
}
