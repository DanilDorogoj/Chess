import java.util.List;

public abstract class ChessPiece {
    private final boolean isWhite;
    private List<Square> availableSquares; // Куда может пойти данная фигура

    public ChessPiece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isValidMove(Square newPosition) {
        return (availableSquares.contains(newPosition)) ? true : false;
    }

    public abstract void refreshValidMoves(Square current); // Сюда ещё должна быть передана доска или массив клеток
}
