/**
 * class that represents the piece Pawn
 * 
 * each Pawn has its color and the square it's sitting on
 *
 * @author Dyland Xue
 * @version 3/15/2013
 *
 * Last Updated: 3/15/2013
 */

public class Pawn implements Piece
{
    private final boolean myColor;
    private Square mySquare;
    private Board myBoard;

    /**
     * constructor with default parameters
     *
     * @param color the color of the Pawn 
     * @param sq    the current square the Pawn occupies
     * @param b     the board this Pawn belongs to
     */
    public Pawn(boolean color, Square sq, Board b)
    {
        myColor = color;
        mySquare = sq;
        myBoard = b;
    }

    /**
     * check whether this Pawn can reach the square sq
     * returns false if it's the same square
     *
     * @param sq destination square
     * @return true if sq is reachable, false otherwise
     */
    public boolean isReachable(Square sq)
    {
        // exclude its own square
        if (mySquare.equals(sq))
            return false;

        // a Pawn can only move forward
        // currently disregarding capturing other pieces
        // TODO: include other cases
        if (sq.getX() != mySquare.getX())
            return false;

        // depends on the color of this piece
        // if this is a White Pawn
        if (myColor == Board.WHITE)
        {
            if (sq.getY() == mySquare.getY() + 1)
                return true;
            if (mySquare.getY() == 2 && sq.getY() == 4)
                return true;
            return false;
        }
        else //(if myColor == Board.BLACK)
        {
            if (sq.getY() == mySquare.getY() - 1)
                return true;
            if (mySquare.getY() == 7 && sq.getY() == 5)
                return true;
            return false;
        }
    }
}
