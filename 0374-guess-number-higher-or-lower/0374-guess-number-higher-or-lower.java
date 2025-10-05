/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int num) {
       int start = 1;
       int end = num;
 
       while(start <= end){
            int mid = start + (end - start)/2;
            int result = guess(mid);

            if(result == 0){
                return mid;
            }else if(result < 0  ){
                //-1: Your guess is higher than the number picked , search on  left 
                end = mid - 1;
            }else{
                //1: Your guess is lower than the number picked  , search on right
                 start = mid + 1;
            }

       }

       return -1;
    }

    

}