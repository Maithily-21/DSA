class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n = candies.length ; 
    
        List<Boolean> result = new ArrayList<>();

        int MaxSum =  0 ;

        //1] find maxsum candy in candiea array 
        for(int i = 0 ; i < n ; i++){
            if(candies[i] > MaxSum){
                MaxSum = candies[i];
            }
        }


        // maxsum after adding extra candies 
        for(int i = 0 ; i < n ; i++){
            if(candies[i] + extraCandies >= MaxSum){
                    result.add(true);
            }else{
                result.add(false);
            }
             
        }

        return result;

       
    }
}