package blind75;

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int num:nums) {
            sum = sum + num;
            if(sum < 0)
                sum = 0;

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, -1, -3, 4, -1, 2, 1, -5, 4};
        int k = maxSubArray(nums);
        System.out.println(k);
    }
}
