// Question Link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // //Aproach 1: BruteForce TC: O(N^2) SC: O(1)
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[j] == target - nums[i]) {
        //             return new int[]{ i, j };
        //         }
        //     }
        // }
        // return null;

        // //Aproach 2: Using Hashmap TC: O(N) SC: O(N)

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            else
                map.put(nums[i], i);
        }

        return null;

    }
}

