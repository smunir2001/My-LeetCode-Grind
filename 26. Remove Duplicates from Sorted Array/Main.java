import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("26. Remove Duplicates from Sorted Array (solution1)");
        Solution1 slt1 = new Solution1();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("\nnums[]: " + Arrays.toString(nums));
        System.out.println("removeDuplicates(nums[]): " + slt1.removeDuplicates(nums));
    }
}