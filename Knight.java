/**
 * class that represents the piece Knight
 * 
 * each Knight has its color and the square it's sitting on
 *
 * @author Dyland Xue
 * @version 3/15/2013
 *
 * Last Updated: 3/15/2013
 */

public class Knight implements Piece
{
    private final boolean myColor;
    private Square mySquare;

    /**
     * constructor with default parameters
     *
     * @param color the color of the Knight 
     * @param sq    the current square the Knight occupies
     */
    public Knight(boolean color, Square sq)
    {
        myColor = color;
        mySquare = sq;
    }

    /**
     * check whether this Knight can reach the square sq
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

        // calculate horizontal and vertical distance
        int h = Math.abs(mySquare.getX() - sq.getX());
        int v = Math.abs(mySquare.getY() - sq.getY());

        // check if one of the dists is 1 and the other is 2
        return (h == 1 && v == 2) || (h == 2 && v == 1);
    }
}
