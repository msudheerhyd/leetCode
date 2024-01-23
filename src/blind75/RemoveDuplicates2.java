package blind75;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5,5,5,5,5};
        int x = removeDuplicates(nums);
        System.out.println(x);
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j=0; j<nums.length; j++) {
            i = i+1;
            while(j!=nums.length-1 && nums[j]==nums[j+1]) {
                j++;
            }
        }
        return i;
    }
}
