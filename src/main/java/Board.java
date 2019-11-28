public class Board {
    private Square[][] squares;
    private King blackKing;
    private King whiteKing;

    public Board() {
        this.squares = new Square[8][8];
        boolean isWhite = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(j, i, isWhite);
                isWhite = !isWhite;
            }
            isWhite = !isWhite;
        }

        squares[0][0].setChessPiece(new Rook(false));
        squares[0][1].setChessPiece(new Knight(false));
        squares[0][2].setChessPiece(new Bishop(false));
        squares[0][3].setChessPiece(new Queen(false));
        blackKing = new King(false);
        squares[0][4].setChessPiece(blackKing);
        squares[0][5].setChessPiece(new Bishop(false));
        squares[0][6].setChessPiece(new Knight(false));
        squares[0][7].setChessPiece(new Rook(false));
        for (int i = 0; i < 8; i++) {
            squares[1][i].setChessPiece(new Pawn(false));
        }

        for (int i = 0; i < 8; i++) {
            squares[6][i].setChessPiece(new Pawn(true));
        }
        squares[7][0].setChessPiece(new Rook(true));
        squares[7][1].setChessPiece(new Knight(true));
        squares[7][2].setChessPiece(new Bishop(true));
        squares[7][3].setChessPiece(new Queen(true));
        whiteKing = new King(true);
        squares[7][4].setChessPiece(whiteKing);
        squares[7][5].setChessPiece(new Bishop(true));
        squares[7][6].setChessPiece(new Knight(true));
        squares[7][7].setChessPiece(new Rook(true));
    }

    public void update() {

    }

    public boolean isCheck() {
        //...
        return false;
    }

    public boolean isCheckMate() {
        //...
        if (!canAvoid() && !canBlock() && !canGetPiece()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGetPiece() {
        //...
        return true;
    }

    public boolean canBlock() {
        //...
        return true;
    }

    public boolean canAvoid() {
        //...
        return true;
    }
}
