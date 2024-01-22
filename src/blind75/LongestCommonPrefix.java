package blind75;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        for(int i=1; i<strs.length; i++) {
            length = Math.min(length, strs[i].length());
            for(int j=0; j<length; j++) {
                char c = strs[0].charAt(j);
                char d = strs[i].charAt(j);
                if(c!=d) {
                    length = j;
                    break;
                }
            }
        }
        return strs[0].substring(0,length);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"String", "Strong", "Stripe"}));
    }
}
