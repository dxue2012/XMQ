/**
 * class that represents the piece Rook
 * 
 * each Rook has its color and the square it's sitting on
 *
 * @author Dyland Xue
 * @version 3/15/2013
 */

public class Rook implements Piece
{
    private final boolean myColor;
    private Square mySquare;

    /**
     * constructor with default parameters
     *
     * @param color the color of the rook
     * @param sq    the current square the rook occupies
     */
    public Rook(boolean color, Square sq)
    {
        myColor = color;
        mySquare = sq;
    }

    /**
     * check whether this rook can reach the square sq
     * returns false if it's the same square
     *
     * @param sq destination square
     * @return true if sq is reachable, false otherwise
     */
    public boolean isReachable(Square sq)
    {
        if (mySquare.equals(sq))
            return false;
        // Rooks move horizontally or vertically
        return mySquare.getX() == sq.getX() || mySquare.getY() == sq.getY();
    }
}
