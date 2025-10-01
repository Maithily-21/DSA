class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunkBottles = numBottles; // Start with the initial full bottles
        int emptyBottles = numBottles;     // All initial bottles become empty after drinking

        // Continue as long as we have enough empty bottles to exchange for a new full bottle
        while (emptyBottles >= numExchange) {
            int newFullBottles = emptyBottles / numExchange; // Number of new full bottles obtained
            totalDrunkBottles += newFullBottles;             // Add them to the total drunk
            
            // Calculate remaining empty bottles:
            // - emptyBottles % numExchange: empty bottles that couldn't be exchanged
            // - newFullBottles: the newly drunk bottles also become empty
            emptyBottles = (emptyBottles % numExchange) + newFullBottles;
        }

        return totalDrunkBottles;
    }
}