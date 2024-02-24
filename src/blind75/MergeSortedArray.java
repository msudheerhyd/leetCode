package blind75;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=nums1.length-1;
        while(i>=0 || j>=0) {
            if(j<0||(i>=0&&nums1[i]>=nums2[j])) {
                nums1[k--]=nums1[i--];
            } else{
                nums1[k--] =nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,3,5};
        int m = 3;
        int n = 3;
    }
}
