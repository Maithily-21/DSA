class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
      
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < n1 ; i++){
            set.add(nums1[i]);
        }
        
        HashSet<Integer> set2 = new HashSet<>();

        for(int j = 0 ; j < n2 ; j++){
            if(set.contains(nums2[j])){
                set2.add(nums2[j]);
            }
        }
        int[] result = new int[set2.size()];
        int i = 0 ;
        for(int num : set2){
            result[i++] = num ;
        }

        return result;
       
    }
}