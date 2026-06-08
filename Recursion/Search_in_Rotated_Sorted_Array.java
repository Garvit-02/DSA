class Solution {
    public int search(int[] nums, int target) {
        int lf = 0;
        int rt = nums.length - 1;

        while (lf <= rt) {
            int mid = lf + (rt - lf) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[lf] <= nums[mid]) {

                if (nums[lf] <= target && target < nums[mid]) {
                    rt = mid - 1;
                } else {
                    lf = mid + 1;
                }

            }
            else {

                if (nums[mid] < target && target <= nums[rt]) {
                    lf = mid + 1;
                } else {
                    rt = mid - 1;
                }
            }
        }

        return -1;
    }
}
