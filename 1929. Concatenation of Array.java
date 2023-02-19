class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int n = 0;
        int i;
        while(n < nums.length*2)
        {
            for(i = 0; i < nums.length; i++)
            {
                ans[i + n] = nums[i];          
            }
            n += i;
            i = 0;
        }
        
        return ans;
    }
}
