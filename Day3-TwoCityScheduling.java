class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(x,y) -> {
            return (x[0]-x[1]) - (y[0]-y[1]);
        });
        int ans = 0;
        int i=0, j=costs.length-1;
        while(i<j) {
            ans = ans+costs[i][0];
            ans=ans+costs[j][1];
            i++;
            j--;
        }
        return ans;
        
        
    }
}