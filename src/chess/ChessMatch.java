
package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;



public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }
    
    public ChessPiece[][] getPieces(){
    
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i=0; i<board.getRows(); i++ ){
            for(int j= 0; j<board.getColumns(); j++){
            
                mat[i][j] = (ChessPiece) board.piece(i, j);
        
            }
            
        }
        
        return mat;
        //inserindo as pecas no tabuleiros
        
    }
     private void initialSetup(){
         board.placePiece(new Rook(board, Color.Whiter), new Position(2, 1));
          board.placePiece(new King(board, Color.Whiter), new Position(4, 5));
           board.placePiece(new King(board, Color.BlACK), new Position(4, 1));
     }
}


    
    
    

