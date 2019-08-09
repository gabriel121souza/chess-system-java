
package boardgame;


public class Position {

    
    private int row; // linha
    private int column;// coluna

    public Position(int row, int color) {
        this.row = row;
        this.column = color;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColor() {
        return column;
    }

    public void setColor(int color) {
        this.column = color;
    }
    @Override
   //para mostrar linha e coluna
    public String toString(){
        return row + ", "+ column;
    }
}
