class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
    	HashSet<Integer> dupe = new HashSet<>();
    	for (int i = 0; i < nums.length; i++)
		{
    		if (dupe.contains(nums[i]))
			{
    			return true;
    		}
            dupe.add(nums[i]);
    	}	
		return false;
    }
}
