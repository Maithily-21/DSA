class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = valueOf(s.charAt(i));

        // Look ahead: if next is larger, subtract this value
            if (i + 1 < s.length() && value < valueOf(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }
    private int valueOf(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}