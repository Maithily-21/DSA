class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length ;

        // 2 pointers approach 
      
        int left = 0 ; 
        int right = n-1 ;
        int MaxWater = 0;

        while(left < right){

            int width = right - left;
            int length = Math.min(height[left],height[right]) ;

            int area = length * width ;

            MaxWater = Math.max(MaxWater , area);
            

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }

        return MaxWater;
    }
}