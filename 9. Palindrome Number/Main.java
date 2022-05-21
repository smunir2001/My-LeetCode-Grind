public class Main {
    public static void main(String[] args) {
        System.out.println("9. Palindrom Number (solution1)");
        int x = 121;
        Solution1 sl1 = new Solution1();
        System.out.println("x = " + x);
        System.out.println("Is " + x + " palindrome: " + sl1.isPalindrome(x));

        System.out.println("\n9. Palindrome Number (solution2)");
        x = -121;
        Solution2 sL2 = new Solution2();
        System.out.println("x = " + x);
        System.out.println("Is " + x + " palindrome: " + sL2.isPalindrome(x));

        System.out.println("\n9. Palindrome Number (solution3)");
        x = 10;
        Solution3 sL3 = new Solution3();
        System.out.println("x = " + x);
        System.out.println("Is " + x + " palindrome: " + sL3.isPalindrome(x));
    }
}
