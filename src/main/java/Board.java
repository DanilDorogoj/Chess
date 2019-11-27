public class Board {
    private Square[][] squares;

    public Board() {
        this.squares = new Square[8][8];
        boolean isWhite = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(j, i, false, null);
                isWhite = !isWhite;
            }
            isWhite = !isWhite;
        }

        // Инициализация фигур
    }
}
