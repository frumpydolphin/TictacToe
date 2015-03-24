
public class TicTacToe
{
    private int player1Or2;
    private Board board;
    private int symbol;
    private int currentRow;
    private int currentColumn;
    public TicTacToe(){
        board = new Board();
        int player1Or2 = 1;
    }
    public void main(){
        //print board
        boolean someoneWon = false;
        while(!someoneWon){
            //ask player 1/2 
            askForMove();
            if(checkIfSomeoneWon()){
                someoneWon = true;
            }
        }        
    }
    public void makeMove(int player, int symbol){
        board.getSpotOnBoard(currentRow, currentColumn);
        if(spotOnBoard = 0){
            board.changeBoard(currentRow, currentColumn, player1Or2);
        }
        //literally put the piece in the board.
    }
    public void checkIfSomeoneWon(){
    }
    public void askForMove(){
        System.out.println("Player " + player1Or2 + " please make your move."); 
        //does a bunch of stuff
        makeMove(player1Or2, scanner.get());
    }
}
