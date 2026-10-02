class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            String word = strs[i];
            String freqId = getFreqId(word);
            if(!map.containsKey(freqId)) map.put(freqId, new ArrayList<>());
            map.get(freqId).add(word);
        }
        return new ArrayList<>(map.values());
    }
    
    public String getFreqId(String s){
        int[] freq = new int[26]; 
        for(int i=0; i<s.length(); i++) { 
            freq[s.charAt(i)-'a']+=1; 
        }    
        return Arrays.toString(freq);
    }
}
