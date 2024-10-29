package BackTracking;

public class getNowQueen {
    final int N=4;
    public boolean checkCondit(int [][] board,int row,int col){
        //check condition for same row
        for(int i=0;i<col;i++){
            if(board[row][i]==1) return false;
        }
        //check for left top diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1)return false;
        }
        //check for left bottom diagonal
        for(int i=row,j=col;i<4 && j>0;i++,j--){
            if(board[i][j]==1) return false;
        }
        return true;
    }
    public boolean findSol(int [][] board,int col){
        if(col>=N) return true;
        for(int i=0;i<4;i++){
            if(checkCondit(board,i,col)==true){
                board[i][col]=1;
                if(findSol(board, col+1)==true) return true;
                board[i][col]=0;
            }
        }
        return false;
    }
    public void printBoard(int [][] board){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(board[i][j]==1) System.out.print("Q");
                else System.out.print("X");
            }
            System.out.println();
        }
    }
    public void queens(){
        int [][] board={
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}
        };
        if(findSol(board,0)==true){
            printBoard(board);
        }
        else{
            System.out.println("Solution doesn't exist");
        }
    }
    public static void main(String[] args) {
        getNowQueen obj=new getNowQueen();
        obj.queens();
    }
}
