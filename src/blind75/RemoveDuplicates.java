package blind75;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 4, 5, 6, 6};
        int i = find(nums);
        System.out.println(i);
    }
    public static int find(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            i = i + 1;
            while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
        }
        return i;
    }
}
