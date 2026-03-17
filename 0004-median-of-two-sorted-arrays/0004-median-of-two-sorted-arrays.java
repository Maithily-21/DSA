class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        //Brute Force 
        //1] Merge both arrays 
        //2] Sort Array 
        //3] Median 

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m+n];

        int i = 0 , j = 0 , k = 0 ;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                merged[k] = nums1[i];
                k++;
                i++;
            }else{
                merged[k] = nums2[j];
                k++;
                j++;
            }
        }

        // remaining numbers will be added at end cause since both arrrays are sorted lasrgest ones apprear at last

        while(i < m){
            merged[k++] = nums1[i++];
        }

        while(j < n){
            merged[k++] = nums2[j++];
        }

        int l = merged.length;

        if(l%2 == 0){
            return (merged[l/2] + merged[l/2 - 1]) / 2.0;
        } else{
            return merged[l/2];
        }

    }
}