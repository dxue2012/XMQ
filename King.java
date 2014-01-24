/**
 * class that represents the piece King
 * 
 * each King has its color and the square it's sitting on
 *
 * @author Dyland Xue
 * @version 3/15/2013
 *
 * Last Updated: 3/15/2013
 */

public class King implements Piece
{
    private final boolean myColor;
    private Square mySquare;

    /**
     * constructor with default parameters
     *
     * @param color the color of the King 
     * @param sq    the current square the King occupies
     */
    public King(boolean color, Square sq)
    {
        myColor = color;
        mySquare = sq;
    }

    /**
     * check whether this King  can reach the square sq
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

        // check if the destination is at most 1 square away
        return Math.abs(mySquare.getX() - sq.getX()) < 2 
            && Math.abs(mySquare.getY() - sq.getY()) < 2;
    }
}
