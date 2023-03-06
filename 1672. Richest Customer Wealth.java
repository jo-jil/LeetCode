class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = accounts[0][0];
        for (int i = 0; i < accounts.length; i++)
        {
            int tot = accounts[i][0];
            for (int j = 1; j < accounts[i].length; j++)
            {
                tot += accounts[i][j];
            }
            if(tot > max)
            {
                max = tot;
            }
        }
        return max;
    }
}
