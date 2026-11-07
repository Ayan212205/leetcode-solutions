class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(backTrack(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean backTrack(char[][]board,String word,int i,int j,int idx){
        if(idx==word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='$' || board[i][j]!=word.charAt(idx)) return false;
        char temp=board[i][j];
        board[i][j]='$'; // marking visited;
        boolean found =
            backTrack(board, word, i, j + 1, idx + 1) || // Right
            backTrack(board, word, i + 1, j, idx + 1) || // Down
            backTrack(board, word, i, j - 1, idx + 1) || // Left
            backTrack(board, word, i - 1, j, idx + 1);   // Up

        board[i][j]=temp;
        return found;
    }
}