package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int diff = target-nums[i];
            if(map.containsKey(diff)) {
                return new int[] { map.get(diff), i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
