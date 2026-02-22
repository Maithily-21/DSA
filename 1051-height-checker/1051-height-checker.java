class Solution {
    public int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];

        // copy array 
        for(int i= 0 ; i < heights.length ; i++){
            expected[i] = heights[i];
        }

        //Insertion sort 
        for(int i = 1 ; i < expected.length ; i++){
            int key = expected[i];
            int j = i - 1;

            while(j >=0 && expected[j] > key){
                //shiftting of j th element to right 
                expected[j+1] = expected[j];
                j--;
            }

            expected[j+1] = key;
        }

        //comparison of both arrrays 

        int count = 0 ;
        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
     
        return count;
    }
}