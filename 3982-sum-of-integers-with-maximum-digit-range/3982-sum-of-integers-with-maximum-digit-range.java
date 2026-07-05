class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            int currentRange =  range(n);
            if(currentRange > maxRange){
                maxRange = currentRange;
            }
            list.add(currentRange);
        }
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(list.get(i)== maxRange){
                sum+=nums[i];
            }
        }
        return sum;
    }
    public static int range(int n ){
        if(n == 0 ){
            return 0;
        }
        n = Math.abs(n);
        int largest = 0 ;
        int smallest = 9;
        while(n > 0 ){
            int digit = n%10;
            if(digit > largest){
                largest = digit;
            }
            if(digit < smallest){
                smallest = digit;
            }
            n = n/10;
       }
       return largest - smallest;
    }
  
}