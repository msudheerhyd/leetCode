package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumAnother {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[] {map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1,7,13,15};
        int target = 20;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(ans);
    }
}
