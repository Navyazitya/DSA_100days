class majorityelement {
    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int[] nums, int lo, int hi) {
        // Base case: If there is only one element, it is the majority.
        if (lo == hi) {
            return nums[lo];
        }

        // Divide the array into left and right halves
        int mid = lo + (hi - lo) / 2;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // If both halves agree on the majority element, return it
        if (left == right) {
            return left;
        }

        // Otherwise, count occurrences of left and right in the current range
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums)); // Output: 2
    }
}
