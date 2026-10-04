class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder();
        List<String> list = new ArrayList<>();
        while(idx<str.length()){
            sb.setLength(0);
            num.setLength(0);
            int count=0;
            while(str.charAt(idx)!='#') {
                num.append(str.charAt(idx)); 
                idx++;
            }
            count = Integer.parseInt(num.toString());
            idx++;
            if(count==0) sb.append("");
            else while(count>0) {
                sb.append(str.charAt(idx)); 
                count--;
                idx++; 
            }
            list.add(sb.toString());
        }
        return list;
    }
}
