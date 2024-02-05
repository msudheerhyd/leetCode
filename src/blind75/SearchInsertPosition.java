package blind75;

public class SearchInsertPosition {

    public static  int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] ==  target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else{
                right = mid;
            }
        }
        if (nums[left] < target) {
            return left + 1;
        }
        else {
            return left;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 8, 9};
        int target = 6;
        int k = searchInsert(nums, target);
        System.out.println(k);
    }
}
