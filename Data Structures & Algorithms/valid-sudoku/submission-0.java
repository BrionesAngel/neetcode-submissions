class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board.length; i++){
            int[] setRow = new int[10];
            int[] setCol = new int[10];
            for(int j=0; j<board.length; j++){
                char c=board[i][j];
                if(c!='.'){
                    if(setRow[c-'1']!=0) return false;
                    setRow[c-'1']++;
                    
                }
                char c2=board[j][i];
                if(c2!='.'){
                    if(setCol[c2-'1']!=0) return false;
                    setCol[c2-'1']++;
                }
            }
        }
        
        for(int sbr=0; sbr<=6; sbr+=3){
            for(int sbc=0; sbc<=6; sbc+=3){
                int[] setBox = new int[10];
                for(int i=sbr; i<sbr+3; i++){
                    for(int j=sbc; j<sbc+3; j++){
                        char c=board[i][j];
                        if(c!='.'){
                            if(setBox[c-'1']!=0) return false;
                            setBox[c-'1']++;
                        }
                    }
                }
            }
        }
        return true;
    }
}
