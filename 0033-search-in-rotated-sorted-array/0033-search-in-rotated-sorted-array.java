class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return Binarysearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        // If target is greater than or equal to first element, search in first half
        if (target >= nums[0]) {
            return Binarysearch(nums, target, 0, pivot - 1);
        }

        return Binarysearch(nums, target, pivot + 1, nums.length - 1);
    }

    public int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // If array is not rotated at all
        if (nums[start] < nums[end]) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int Binarysearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
