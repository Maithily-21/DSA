class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // a- z 
        int[] frequency = new int[26]; 

        //count letters in magazine and update it 
        for(char ch : magazine.toCharArray()){
            frequency[ch-'a']++;
        }

        // Subtract the letter used by ransomNote
        for(char ch : ransomNote.toCharArray()){
            frequency[ch-'a']--;
            if(frequency[ch-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}