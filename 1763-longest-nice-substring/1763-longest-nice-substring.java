class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();

        String ans = "";
        int maxLen = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j< n; j++){
                String sub = s.substring(i,j+1);
                if(niceString(sub)){
                    if(sub.length()>maxLen){
                        maxLen = sub.length();
                        ans = sub;
                    }
                }
            }
        }

        return ans;
    }
    public static boolean niceString(String sub){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < sub.length() ; i++ ){
            char ch = sub.charAt(i);
            set.add(ch);
        }
        for(int i = 0 ; i < sub.length() ; i++){
            char ch = sub.charAt(i);
            if(Character.isLowerCase(ch) && !set.contains(Character.toUpperCase(ch))){
                return false;
            }
            if(Character.isUpperCase(ch) && !set.contains(Character.toLowerCase(ch))){
                return false;
            }
        }

        return true;
    }
}