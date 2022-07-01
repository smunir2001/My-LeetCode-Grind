import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("27. Remove Element (solution1)");
        Solution1 slt1 = new Solution1();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println("nums[]: " + Arrays.toString(nums));
        System.out.println("val = " + val);
        System.out.println("removeElement(): " + slt1.removeElement(nums, val));
    }
}
