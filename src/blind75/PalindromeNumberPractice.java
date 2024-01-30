package blind75;

public class PalindromeNumberPractice {

    public static boolean isPalindrome(int x) {
        if(x<0) return false;

        int reverse = 0, copy = x;

        while(copy > 0) {
            int digit = copy % 10;
            reverse = reverse * 10 + digit;
            copy /= 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome(121);
        System.out.println(ans);
    }
}
