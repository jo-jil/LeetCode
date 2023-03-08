class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int words = 1;
        for(int i = 0; i < sentences.length; i++)
        {
            String name = sentences[i];
            for(int j = 0; j < name.length(); j++)
            {
                char a = name.charAt(j);
                if(a == ' ')
                {
                    words ++;
                }
            }
            if(words > max)
            {
                max = words;
            }
            words = 1;
        }
        return max;
    }
}
