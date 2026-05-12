class Solution {
    public int minimumEffort(int[][] tasks) {

        // Sort by (minimum - actual) descending
        Arrays.sort(tasks, (a, b) ->
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int energy = 0;
        int answer = 0;

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            // If current energy is less than required minimum
            if (energy < minimum) {

                // Add extra energy
                answer += (minimum - energy);

                // Update current energy
                energy = minimum;
            }

            // Complete the task
            energy -= actual;
        }

        return answer;
    }
}