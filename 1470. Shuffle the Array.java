class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = 0;
        int r = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i%2 == 0)
            {
                ans[i] = nums[r];
                r++;
            }
            else
            {
                ans[i] = nums[n + j];
                j++;
            }
        }
        return ans;
    }
}
