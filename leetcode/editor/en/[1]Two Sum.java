//Given an array of integers nums and an integer target, return indices of the 
//two numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may 
//not use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// Only one valid answer exists. 
// 
//
// 
//Follow-up: Can you come up with an algorithm that is less than 
//O(n²)
// time complexity?
//
// Related Topics Array Hash Table 👍 54408 👎 1829


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class SolutionTwoSum {

    public int[] twoSumSol1(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{j, i};
                }
            }
        }
        return new int[2];
    }

    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>();

        final int length = nums.length;

        for (int i = 0; i < length; i++) {
            final int current = nums[i];
            final int expectedSecond = target - current;

            final Integer secondIndex;
            if ((secondIndex = map.get(expectedSecond)) != null) {
                return new int[]{i, secondIndex};
            }

            map.put(current, i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        /*System.out.println(Arrays.toString(new SolutionTwoSum().twoSum(
            new int[]{3, 2, 4}, 5
        )));*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)
