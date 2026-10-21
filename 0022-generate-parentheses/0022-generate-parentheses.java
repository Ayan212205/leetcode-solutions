class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backTrack(n,result,sb,0,0);
        return result;
    }
    private void backTrack(int n,List<String> result,StringBuilder ans,int open,int close){
        if(ans.length()==n*2){
            result.add(ans.toString());
            return;
        }
        if(open<n){
            ans.append('(');
            backTrack(n,result,ans,open+1,close);
            ans.deleteCharAt(ans.length()-1);
        }
        if(close<open){
            ans.append(')');
            backTrack(n,result,ans,open,close+1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}