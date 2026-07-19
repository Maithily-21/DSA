class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        boolean[] visited = new boolean[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // One occurrence is now processed
            freq[ch - 'a']--;

            // Skip duplicates already in the stack
            if (visited[ch - 'a']) {
                continue;
            }

            // Maintain lexicographically smallest order
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && freq[stack.peek() - 'a'] > 0) {

                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }
}