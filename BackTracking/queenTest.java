package BackTracking;

public class queenTest {
    final int N=4;
    public boolean solExist(int [][]board,int row,int col){
        for(int i=0;i<col;i++){
            if(board[row][i]==1) return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1) return false;
        }
        for(int i=row,j=col;i<N && j>=0;i++,j--){
            if(board[i][j]==1) return false;
        }
        return true;
    }
    public boolean findSol(int [][] board,int col){
        if(col>=N) return true;
        for(int i=0;i<4;i++){
            if(solExist(board,i,col)==true){
                board[i][col]=1;
                if(findSol(board, col+1)==true) return true;
                board[i][col]=0;
            } 
        }
        return false;
    }
    public void solveQueen(){
        int board [][]={{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};
        if(findSol(board,0)==false){
            System.out.println("Soluion do not exist");
        }else{
            printSol(board);
        }
    }
    public void printSol(int [][]board){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(board[i][j]==1){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queenTest obj=new queenTest();
        obj.solveQueen();
    }
}
