class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = 0;
        int index = m;   // start inserting from m

        while (i < n) {
            nums1[index] = nums2[i];
            index++;
            i++;
        }

        Arrays.sort(nums1);


    }
}