class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //Fixed Sliddin gWindow Pattern 
        int leftSum  = 0 ;
        int rightSum = 0 ;
        int maxSum = 0 ;
        //First I am assuming i am picking all k cards from begining 
        for(int i = 0 ; i < k ; i++){
            leftSum = leftSum + cardPoints[i];
        }
        maxSum = leftSum ;
        //Now I will be removing one element from begining and add one element from back 
        int rightIdx = cardPoints.length - 1;
        for(int i = k - 1 ; i >= 0 ; i--){
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[rightIdx];
            maxSum = Math.max(maxSum , leftSum + rightSum);
            rightIdx--;
        }

        return maxSum;
    }
}