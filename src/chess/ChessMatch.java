
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
        private void placeNewPiece(char column, int row, ChessPiece piece){
            board.placePiece(piece, new ChessPosition(column, row).toPosition());
        }
    
    private void initialSetup(){
                placeNewPiece('b', 6, new Rook(board, Color.Whiter));
		placeNewPiece('e', 5, new King(board, Color.Whiter));
		placeNewPiece('e', 1, new King(board, Color.BlACK));
		placeNewPiece('c', 1, new Rook(board, Color.Whiter));
        placeNewPiece('c', 2, new Rook(board, Color.Whiter));
        placeNewPiece('d', 2, new Rook(board, Color.Whiter));
        placeNewPiece('e', 2, new Rook(board, Color.Whiter));
        placeNewPiece('e', 4, new Rook(board, Color.Whiter));
        placeNewPiece('d', 1, new King(board, Color.Whiter));

        placeNewPiece('c', 7, new Rook(board, Color.BlACK));
        placeNewPiece('c', 8, new Rook(board, Color.BlACK));
        placeNewPiece('d', 7, new Rook(board, Color.BlACK));
        placeNewPiece('e', 7, new Rook(board, Color.BlACK));
        placeNewPiece('e', 8, new Rook(board, Color.BlACK));
        placeNewPiece('d', 8, new King(board, Color.BlACK));
}
}


    
    
    

