//Question Link: https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        int numsLen = nums.length;
        int zeroIndex = 0, numIndex = 0;

        while (numIndex < numsLen) {
            if (nums[numIndex] == 0) {
                numIndex++;
            } else {
                if (zeroIndex == numIndex) {
                    zeroIndex++;
                    numIndex++;
                } else {
                    nums[zeroIndex++] = nums[numIndex];
                    nums[numIndex++] = 0;
                }
            }
        }
    }
}