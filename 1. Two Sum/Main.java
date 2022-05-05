import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Two Sum (solution1)\n");
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution1 sl1 = new Solution1();
        System.out.println("nums[]: " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("twoSum(nums[], target): " + Arrays.toString(sl1.twoSum(nums, target)));

        System.out.println("\n2. Two Sum (solution2)\n");
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        Solution2 sl2 = new Solution2();
        System.out.println("nums[]: " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("twoSum(nums[], target): " + Arrays.toString(sl2.twoSum(nums2, target2)));

        System.out.println("\n3. Two Sum (solution3)\n");
        int[] nums3 = {3, 3};
        int target3 = 6;
        Solution3 sl3 = new Solution3();
        System.out.println("nums[]: " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("twoSum(nums[], target): " + Arrays.toString(sl3.twoSum(nums3, target3)));
    }
}
