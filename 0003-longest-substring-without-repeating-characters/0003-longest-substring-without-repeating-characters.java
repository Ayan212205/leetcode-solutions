class Solution {
    public int lengthOfLongestSubstring(String s) {
        int window=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char leftChar=s.charAt(window);
                map.put(leftChar,map.get(leftChar)-1);
                window++;
            }
            count=Math.max(count,i+1-window);

        }
        return count;
    }
}