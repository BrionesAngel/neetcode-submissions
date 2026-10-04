class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];
        for(int i=0; i<strs.length; i++) {
            while(word.length()>0 && !strs[i].startsWith(word)) 
                word = word.substring(0, word.length()-1);
        }
        return word;
    }
}