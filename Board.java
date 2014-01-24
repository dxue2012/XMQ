/**
 * class that represents a chess board
 * 
 * @author Dyland Xue
 * @version 3/15/2013
 *
 * Last Updated: 3/15/2013
 */

public class Board
{
    public static final boolean WHITE = true;  // to simplify syntax, we
    public static final boolean BLACK = false; // assign booleans for the two colors
    public static final int     N     = 8;     // side length of a ChessBoard

    private boolean myTurn;     // turn indicator
    private Piece[][] myPieces; // the 8-by-8 board of pieces

    /**
     * default constructor, sets the board to initial state
     */
    public Board()
    {
        // initialize board
        myPieces = new Piece[N+1][N+1];

        // initialize Pawns
        for (int col = 1; col <= N; col++)
        {
            Pawn whitePawn = new Pawn(WHITE, new Square(2, col), this);
            myPieces[2][col] = whitePawn;

            Pawn blackPawn = new Pawn(BLACK, new Square(7, col), this);
            myPieces[7][col] = blackPawn;
        }

        // initialize other pieces
        // Rooks
        myPieces[1][1] = new Rook(WHITE, new Square(1, 1));
        myPieces[8][1] = new Rook(WHITE, new Square(8, 1));
        myPieces[1][8] = new Rook(BLACK, new Square(1, 8));
        myPieces[8][8] = new Rook(BLACK, new Square(8, 8));

        // Knights
        myPieces[2][1] = new Knight(WHITE, new Square(2, 1));
        myPieces[7][1] = new Knight(WHITE, new Square(7, 1));
        myPieces[2][8] = new Knight(BLACK, new Square(2, 8));
        myPieces[7][8] = new Knight(BLACK, new Square(7, 8));

        // Bishops
        myPieces[3][1] = new Bishop(WHITE, new Square(3, 1));
        myPieces[6][1] = new Bishop(WHITE, new Square(6, 1));
        myPieces[3][8] = new Bishop(BLACK, new Square(3, 8));
        myPieces[6][8] = new Bishop(BLACK, new Square(6, 8));

        // Queens
        myPieces[4][1] = new Queen(WHITE, new Square(4, 1));
        myPieces[4][8] = new Queen(BLACK, new Square(4, 8));

        // Kings
        myPieces[5][1] = new King(WHITE, new Square(5, 1));
        myPieces[5][8] = new King(BLACK, new Square(5, 8));

        // turn
        myTurn = WHITE;
    }

    /**
     * constructor with a turn indicator and a 2D array of pieces
     *
     * @param turn whose turn it is
     * @param pieces the 2D array of pieces
     */
    public Board(boolean turn, Piece[][] pieces)
    {
        myTurn = turn;
        myPieces = pieces;
    }

    /**
     * @return true if it's White's turn, false otherwise
     */
    public boolean turn()
    {
        return myTurn;
    }

    /**
     * @return string representation of the board
     */
    @Override 
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int row = 1; row <= N; row++)
        {
            for (int col = 1; col <= N; col++)
            {
                sb.append(myPieces[row][col] + " ");
            }

            sb.append("\n");
        }

        return sb.toString();
    }

    // unit test client
    public static void main(String[] args)
    {
    }
}
