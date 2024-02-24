package blind75;

public class ClimbStairs4Practice2 {

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;

        int ways1 = 1, ways2 = 1;

        for (int i = 2; i < n; i++) {
            int ways = ways1 + ways2;
            ways2 = ways1;
            ways1 = ways;
        }
        return ways1;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10 ));
    }
}
