class Solution {
    void printGfg(int N) {
        // Base case
        if (N <= 0) {
            return;
        }
        
        // Print GFG
        System.out.print("GFG ");
        
        // Recursive call
        printGfg(N - 1);
    }
}
