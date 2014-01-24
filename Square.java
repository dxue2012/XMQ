/**
 * helper class that simplifies the syntax
 * represents a square on the chess board
 *
 * @author Dyland Xue
 * @version 3/15/2013
 */

public class Square
{
    private int x;
    private int y;

    /**
     * constructor with the x and y coordinates of the square
     *
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Square(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    /**
     * compares another square with this square
     *
     * @param o the comparable object
     * @return true if the other object is a square, and has the same coordinates
     */
    public boolean equals(Object o)
    {
        if (o == this) return true;
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;

        Square that = (Square) o;

        return this.x == that.x && this.y == that.y;
    }
}

