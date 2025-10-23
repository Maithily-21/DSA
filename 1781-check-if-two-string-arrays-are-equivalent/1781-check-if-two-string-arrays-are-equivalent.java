class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder w1 = new StringBuilder();

        for(int i = 0 ; i < word1.length ; i++){
            w1.append(word1[i]);
        }

        StringBuilder w2 = new StringBuilder();

        for(int i = 0 ; i < word2.length ; i++){
            w2.append(word2[i]);
        }

        String Word1 = w1.toString();
        String Word2 = w2.toString();

        if(Word1.equals(Word2)){
            return true;
        }

        return false;
    }
}