import java.util.*;

class Solution {
    private int i = 0;

    public String countOfAtoms(String formula) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> counts = parse(formula);
        
        // Sort the elements alphabetically
        List<String> atoms = new ArrayList<>(counts.keySet());
        Collections.sort(atoms);
        
        // Build the output string
        for (String atom : atoms) {
            sb.append(atom);
            int count = counts.get(atom);
            if (count > 1) {
                sb.append(count);
            }
        }
        
        return sb.toString();
    }

    private Map<String, Integer> parse(String formula) {
        Map<String, Integer> map = new HashMap<>();
        int n = formula.length();
        
        while (i < n && formula.charAt(i) != ')') {
            if (formula.charAt(i) == '(') {
                i++; // Skip '('
                Map<String, Integer> nestedMap = parse(formula);
                i++; // Skip ')'
                
                // Get the multiplier after ')'
                int multiplier = getCount(formula);
                
                // Merge the nested map into the current map
                for (String atom : nestedMap.keySet()) {
                    map.put(atom, map.getOrDefault(atom, 0) + nestedMap.get(atom) * multiplier);
                }
            } else {
                // Parse Atom name (Starts with Uppercase, followed by optional lowercase)
                StringBuilder atomSb = new StringBuilder();
                atomSb.append(formula.charAt(i++));
                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    atomSb.append(formula.charAt(i++));
                }
                String atom = atomSb.toString();
                
                // Parse optional count for this specific atom
                int count = getCount(formula);
                map.put(atom, map.getOrDefault(atom, 0) + count);
            }
        }
        
        return map;
    }

    private int getCount(String formula) {
        int n = formula.length();
        if (i >= n || !Character.isDigit(formula.charAt(i))) {
            return 1; // Default count is 1 if no digit follows
        }
        
        int count = 0;
        while (i < n && Character.isDigit(formula.charAt(i))) {
            count = count * 10 + (formula.charAt(i) - '0');
            i++;
        }
        return count;
    }
}
