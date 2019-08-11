
package boardgame;


public class Position {

    
    private int row; // linha
    private int column;// coluna

    //Construtor
    public Position(int row, int color) {
        this.row = row;
        this.column = color;
    }

    //getters e Setterss
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int color) {
        this.column = color;
    }
    @Override
   // mostrar linha e coluna
    public String toString(){
        return row + ", "+ column;
    }
}
