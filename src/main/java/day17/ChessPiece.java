package day17;

public enum ChessPiece {

    KING_WHITE(100,"Король (белый)", "♔"), KING_BLACK(100,"Король (черный)", "♚"),
    QUEEN_WHITE(9,"Ферзь (белый) ","♕"), QUEEN_BLACK(9, "Ферзь (черный)",  "♛"),
    BISHOP_WHITE(3.5,"Слон (белый)",   "♗"), BISHOP_BLACK(3.5,"Слон (черный)",  "♝"),
    KNIGHT_WHITE(3,"Конь (белый)",   "♘"), KNIGHT_BLACK(3, "Конь (черный)",   "♞"),
    ROOK_WHITE(5,"Ладья (белая)","♖"), ROOK_BLACK(5,"Ладья (черная)",  "♜"),
    PAWN_WHITE(1,"Пешка (белая)","♙"), PAWN_BLACK(1,"Пешка (черная)","♟"),
    EMPTY(-1,"Пустая клетка","_");

    double cost;
    String name;
    String image;

    ChessPiece(double cost, String name, String image) {
        this.cost = cost;
        this.name = name;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return image;
    }
}
