class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        for(int i=0; i<strs.length; i++) {
            String word1 = strs[i];
            List<String> list = new ArrayList<>();
            if(word1==null) continue;
            list.add(word1);
            for(int j=i+1; j<strs.length; j++) {
                String word2 = strs[j];
                if(word2==null) continue;
                if(isAnagram(word1, word2)){
                    list.add(word2);
                    strs[j]=null;
                }
            }
            answer.add(list);
        }
        return answer;
    }
    
    public boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i)-'a']+=1;
            freq[s2.charAt(i)-'a']-=1;
        }
        for(int i=0; i<freq.length; i++) {
            if(freq[i]!=0) return false;
        }
        return true;
    }
}
