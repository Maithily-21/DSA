import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Step 2: Max Heap
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!freq.get(a).equals(freq.get(b))) {
                    return freq.get(b) - freq.get(a); // higher freq first
                }
                return a.compareTo(b); // lexicographical order
            }
        );

        pq.addAll(freq.keySet());

        // Step 3: Get top k
        List<String> result = new ArrayList<>();
        while (k-- > 0) {
            result.add(pq.poll());
        }

        return result;
    }
}
