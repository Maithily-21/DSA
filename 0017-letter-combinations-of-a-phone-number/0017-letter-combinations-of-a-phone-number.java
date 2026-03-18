class Solution {
    public List<String> letterCombinations(String digits) {
        
        //we have to return arrayList

        return subseq("" , digits);
    }
     static String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    static ArrayList<String> subseq(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        // get ascii value
        int number = unprocessed.charAt(0) - '0' ;
        String letters = map[number] ;

        //local Arraylist
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0 ; i < letters.length() ; i++ ){
            char ch = letters.charAt(i);
            result.addAll(subseq(processed + ch , unprocessed.substring(1)));
        }

       return result;
    }
}