class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return -1;
        
        
    }
}
