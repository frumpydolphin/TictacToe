public class Board{
    private int[][] spotOnBoard;
    private String playField;
    
    public Board(){
        spotOnBoard = new int[3][3];
        spotOnBoard[0][0] = 0;
        spotOnBoard[0][1] = 0;
        spotOnBoard[0][2] = 0;
        spotOnBoard[1][0] = 0;
        spotOnBoard[1][1] = 0;
        spotOnBoard[1][2] = 0;
        spotOnBoard[2][0] = 0;
        spotOnBoard[2][1] = 0;
        spotOnBoard[2][2] = 0;
    }
    public void printBoard(){
        for(int row = 0; row < 3; row += 1){
            System.out.println(spotOnBoard[row][0] + "|" + spotOnBoard[row][1] + "|" + spotOnBoard[row][2]);
        }
    }
    public int getSpotOnBoard(int row, int column){
        return spotOnBoard[row][column];
    }
    public void changeBoard(int row, int col, int player){
        if(player == 1){
            spotOnBoard[row][col] = 1;
        }
        else{
            spotOnBoard[row][col] = 2;
        }
    }
}