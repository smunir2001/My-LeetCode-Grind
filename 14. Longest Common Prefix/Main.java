import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("14. Longest Common Prefix (solution1)");
        Solution1 slt1 = new Solution1();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("strs[]: " + Arrays.toString(strs));
        System.out.println("longest common prefix: " + slt1.longestCommonPrefix(strs));
        Solution1 slt2 = new Solution1();
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("\nstrs2[]: " + Arrays.toString(strs2));
        System.out.println("longest common prefix: " + slt2.longestCommonPrefix(strs2));
    }
}
