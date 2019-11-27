public class Square {
    private int x, y;
    private final boolean isWhite;
    private ChessPiece currentPiece; // Какая фигура стоит на клетке. Если null - никакая

    public Square(int x, int y, ChessPiece currentPiece) {
        this.x = x;
        this.y = y;
        this.currentPiece = currentPiece;
        if ((x + y) % 2 == 0) {
            this.isWhite = false;
        } else {
            this.isWhite = true;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setChessPiece(ChessPiece p) {

    }

    public boolean isWhite() {
        return isWhite;
    }

    public ChessPiece getCurrentPiece() {
        return currentPiece;
    }

    public boolean isOccupied() {
        return (currentPiece == null) ? false : true;
    }
}
