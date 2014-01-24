/**
 * class that represents the piece Queen
 * 
 * each Queen has its color and the square it's sitting on
 *
 * @author Dyland Xue
 * @version 3/15/2013
 */

public class Queen implements Piece
{
    private final boolean myColor;
    private Square mySquare;

    /**
     * constructor with default parameters
     *
     * @param color the color of the Queen
     * @param sq    the current square the Queen occupies
     */
    public Queen(boolean color, Square sq)
    {
        myColor = color;
        mySquare = sq;
    }

    /**
     * check whether this Queen can reach the square sq
     * returns false if it's the same square
     *
     * @param sq destination square
     * @return true if sq is reachable, false otherwise
     */
    public boolean isReachable(Square sq)
    {
        if (mySquare.equals(sq))
            return false;

        // any square reachable by a rook is reachable by a queen
        if (mySquare.getX() == sq.getX() || mySquare.getY() == sq.getY())
            return true;

        // otherwise, check if the square is reachable by a bishop
        return Math.abs(mySquare.getX() - sq.getX()) == Math.abs(mySquare.getY() - sq.getY());
    }
}
