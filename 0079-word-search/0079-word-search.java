class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=solve(board,i,j,word,0,vis);
                    if(ans)
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] board, int row,int col, String word, int ind,boolean[][] vis){
        if(ind==word.length())
        return true;

        if(row>=board.length||row<0||col<0||col>=board[0].length||board[row][col]!=word.charAt(ind)||vis[row][col]==true)
        return false;

        vis[row][col]=true;

        boolean opt1=solve(board,row+1,col,word,ind+1,vis);
        boolean opt2=solve(board,row,col+1,word,ind+1,vis);
        boolean opt3=solve(board,row-1,col,word,ind+1,vis);
        boolean opt4=solve(board,row,col-1,word,ind+1,vis);

        vis[row][col]=false;
        return opt1||opt2||opt3||opt4;
    }
}