public class Solution1 {
    public boolean isPalindrome(int x) {
        if (x <= 0) {
            return false;
        }
        String xStr = String.valueOf(x);
        return isStrPalindrome(xStr);
    }

    private boolean isStrPalindrome(String input) {
        boolean flag = true;
        input = input.toLowerCase();
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}