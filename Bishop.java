/**
 * class that represents the piece Bishop
 * 
 * each Bishop has its color and the square it's sitting on
 *
 * @author Dyland Xue
 * @version 3/15/2013
 *
 * Last Updated: 3/15/2013
 */

public class Bishop implements Piece
{
    private final boolean myColor;
    private Square mySquare;

    /**
     * constructor with default parameters
     *
     * @param color the color of the Bishop
     * @param sq    the current square the Bishop occupies
     */
    public Bishop(boolean color, Square sq)
    {
        myColor = color;
        mySquare = sq;
    }

    /**
     * check whether this Bishop can reach the square sq
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

        // check if the two squares are on the same diagonal
        return Math.abs(mySquare.getX() - sq.getX()) == Math.abs(mySquare.getY() - sq.getY());
    }
}
