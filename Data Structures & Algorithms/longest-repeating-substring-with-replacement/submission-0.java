class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int max=0;
        int[] freq = new int[26];
        for(int r=0; r<s.length(); r++) {
            freq[s.charAt(r)-'A']++;
            while(((r-l+1)-maxFreq(freq))>k) {
                freq[s.charAt(l)-'A']--;
                l++;
            }
            
            max=Math.max(max, r-l+1);
        }
        return max;
    }
    public int maxFreq(int[] freq) {
        int max=0;
        for(int f:freq) max=Math.max(max,f);
        return max;
    }
}
