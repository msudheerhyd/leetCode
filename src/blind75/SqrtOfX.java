package blind75;

public class SqrtOfX {
    public static int mySqrt(int x) {
        long left=0, right=(x/2)+1;

        while(left<right) {
            long mid = left + (right -left)/2 + 1;
            long square = mid * mid;

            if(square == x) {
                return (int) mid;
            } else if(square < x) {
                left = mid;
            } else {
                right = mid-1;
            }
        }
        return (int) left;
    }

    public static void main(String[] args) {
        int k = mySqrt(6);
        System.out.println(k);
    }
}
