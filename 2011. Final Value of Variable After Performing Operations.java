class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++)
        {
            if(operations[i].compareTo("++X") == 0 || operations[i].compareTo("X++") == 0)
            {
                x++;
            }
            else if(operations[i].compareTo("--X") == 0 || operations[i].compareTo("X--") == 0)
            {
                x--;
            }
        }
        return x;
    }
}
