package BackTracking;
public class nQueens {
    final int N=8;
    public boolean placeCondition(int [][] board,int row,int col){
        //checking for same row
        for(int i=0;i<col;i++){
            if(board[row][i]==1) return false;
        }
        //checking left top diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1) return false;
        }
        //checking left bottom
        for(int i=row,j=col;i<8 && j>=0;i++,j--){
            if(board[i][j]==1) return false;
        }
        return true;
    }
    public boolean findSol(int [][] board,int col){
        if(col>=N) return true;
        for(int i=0;i<8;i++){
            if((placeCondition(board,i,col))==true){
                board[i][col]=1;
                if(findSol(board,col+1)==true) return true;
                board[i][col]=0;
            }
        }
        return false;
    }
    public void printBoard(int [][] board){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]==1){
                    System.out.print("Q");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
    public void queens(){
        int [][] board={
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}
        };
        if(findSol(board,0)==false) System.out.println("Solution do not exist");
        else printBoard(board);
    }
    public static void main(String[] args) {
        nQueens obj=new nQueens();
        obj.queens();
    }
}
