import java.util.Arrays;

/**
 * @author papio
 * @version 1.0
 * @description:
 * @date 2022/4/14 上午11:17
 */

public class test {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15,5,5,6};
        int target = 10;
        int[] result = Solution.twoSumByHash(nums, target);
        Arrays.stream(result).forEach(i -> System.out.println(i));
    }
}
