
package application;
import boardgame.Board;
import chess.ChessMatch;




public class Program {

    public static void main(String[]agrs){
        ChessMatch chessMatch = new  ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
