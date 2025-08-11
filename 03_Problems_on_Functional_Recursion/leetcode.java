
public class leetcode {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String pal = Integer.toString(x); // 
        return checkPalindrome(pal, 0, pal.length() - 1);
    }

    private boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return checkPalindrome(s, left + 1, right - 1);
    }
}
