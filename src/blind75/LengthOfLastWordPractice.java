package blind75;

public class LengthOfLastWordPractice {

    public static int lengthOfLastWord(String s) {
        int i=s.length()-1, length=0;
        while(i>=0 && s.charAt(i) == ' ')i--;
        while(i>0 && s.charAt(i)!=' ') {
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {
        int k = lengthOfLastWord("Hello How are you");
        System.out.println(k);
    }
}
