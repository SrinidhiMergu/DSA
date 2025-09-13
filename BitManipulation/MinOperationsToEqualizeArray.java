package BitManipulation;

public class MinOperationsToEqualizeArray {
    public int minOperations(int[] nums) {
        // Global AND
        int allElements = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            allElements &= nums[i];
        }
        // all equal case
        boolean isEqual = true;
        for (int num : nums) {
            if (num != allElements) {
                isEqual = false;
                break;
            }
        }
        return isEqual ? 0 : 1;
    }

    public static void main(String[] args) {
        MinOperationsToEqualizeArray solver = new MinOperationsToEqualizeArray();
        int[] nums1 = { 5, 5, 5 };
        int[] nums2 = { 1, 2 };
        int[] nums3 = { 109, 14, 19, 32, 89 };

        System.out.println(solver.minOperations(nums1)); // 0
        System.out.println(solver.minOperations(nums2)); // 1
        System.out.println(solver.minOperations(nums3)); // 1
    }
}
