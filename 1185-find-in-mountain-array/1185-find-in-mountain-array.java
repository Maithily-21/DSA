/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
     public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakidx = findPeakElement(mountainArr);
        
        // Search on left part (ascending)
        int leftidx = binarySearch(mountainArr, target, 0, peakidx, true);
        if (leftidx != -1) {
            return leftidx;
        }

        // Search on right part (descending)
        return binarySearch(mountainArr, target, peakidx + 1, mountainArr.length() - 1, false);
    }

    public int findPeakElement(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // At the end, start == end → peak element
        return start;
    }

    public int binarySearch(MountainArray arr, int target, int start, int end, boolean isAscOrd) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (target == midVal) {
                return mid;
            }

            if (isAscOrd) {
                if (target > midVal) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // descending order
                if (target < midVal) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}