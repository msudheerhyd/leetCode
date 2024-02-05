package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumPractice2 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 11;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
