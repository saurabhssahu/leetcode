class Solution {
    public int sumFourDivisors(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum = sum + getDivisorsSum(num);
        }

        return sum;
    }

    private int getDivisorsSum(int num) {
        Set<Integer> divisors = new HashSet<>();

        for (int i=1; i<=Math.sqrt(num); i++) {

            if (divisors.size() > 4) {
                break;
            }

            if (num % i == 0) {
                divisors.add(i);
                divisors.add(num/i);
            }
        }

        if (divisors.size() == 4) {
            int sums = 0;
            for(int div : divisors) {
                sums += div;
            }
            return sums;
        }

        return 0;

    }
}