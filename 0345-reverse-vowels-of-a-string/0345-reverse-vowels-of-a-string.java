class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        char[] array = s.toCharArray();

        int left = 0 ;
        int right = s.length() - 1 ;

        while(left <=  right){
            if(!isVowel(array[left])){
               left++;
            } else if(!isVowel(array[right])){
                right--;
            }
            else{
                // swap vowels 
                char temp = array[left] ;
                array[left] = array[right];
                array[right] = temp ;
                left++ ;
                right--;
            }
        }
        for(int i = 0 ; i < s.length() ; i++){
            sb.append(array[i]);
        }
       return sb.toString();
    }

    public boolean isVowel(char c ){
            c = Character.toLowerCase(c);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                return true ;
            }
            else{
               return false ;
            }
        }
}