import java.util.HashMap;
import java.util.Map;

/**
 * @author papio
 * @version 1.0
 * @description:
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * 提示：
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * @date 2022/4/14 上午11:17
 */

public class Solution {

    /**
     * 刚开始的暴力解决办法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - num1;
            for (int j = 0; j < nums.length; j++){
                if (i != j && num2 == nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * 借助map一次遍历实现
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumByHash(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int otherNum = target - nums[i];
            if (result.containsKey(otherNum)) {
                return new int[]{result.get(otherNum),i};
            }
            result.put(nums[i], i);
        }
        // 这里返回值就先这么返回了
        return new int[]{};
    }
}
