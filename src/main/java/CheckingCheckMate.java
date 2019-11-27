import java.util.List;

public class CheckingCheckMate {
    private Board board;
    private King blackKing;
    private King whiteKing;
    private List<Square> correctBKSquare;
    private List<Square> correctWKSquare;


    public CheckingCheckMate(Board board, King blackKing, King whiteKing,
                             List<Square> correctBKSquare, List<Square> correctWKSquare) {
        this.board = board;
        this.blackKing = blackKing;
        this.whiteKing = whiteKing;
        this.correctBKSquare = correctBKSquare;
        this.correctWKSquare = correctWKSquare;
    }

    public void update() {

    }

    public boolean playerInCheck() {
        boolean result = false;
        return result;
    }

    public boolean playerInCheckMate() {
        boolean result = false;
        return result;
    }

    public boolean canGetPiece() {
        boolean result = false;
        return result;
    }

    public boolean canBlock() {
        boolean result = false;
        return result;
    }

    public boolean canAvoid() {
        boolean result = false;
        return result;
    }
}
