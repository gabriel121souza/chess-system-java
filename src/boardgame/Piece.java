
package boardgame;


public class Piece {

     protected Position position;
     private Board board;

    public Piece(Board board) {
        this.board = board;
      //posicao nula 
        position = null;
       }

    protected Board getBoard() {
        return board;
    }
     
     
        
     
}
