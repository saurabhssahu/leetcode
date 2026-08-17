class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) return false;
        int temp = x;
        int reversedNum = 0;

        while (temp > 0) {
           int y = temp % 10;
           reversedNum = (reversedNum * 10) + y;
           temp = temp / 10;
        }

        return x==reversedNum;
        
    }
}