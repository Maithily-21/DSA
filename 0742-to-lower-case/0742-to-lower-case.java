class Solution {
    public String toLowerCase(String s) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(ch >= 'A' || ch <= 'Z'){
                ch = Character.toLowerCase(ch);
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}