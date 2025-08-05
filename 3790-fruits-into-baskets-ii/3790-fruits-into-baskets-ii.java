class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int n = fruits.length;

        boolean[] isFilled = new boolean[n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!isFilled[j] && fruits[i] <= baskets[j]){
                    isFilled[j] = true ;
                    break;
                }
            }
        }

        int count = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(isFilled[i] == false){
                count++ ;
            }
        }
        
        return count ; 
    }
}