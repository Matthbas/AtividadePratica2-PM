package desafio1;

/**
 * @author Francisco de Paula Dias Neto
 */
public class Point {
    private float x;
    private float y;

    void setCoordinates(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public final float getX() {
        return x;
    }

    public final float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinate x= " + x + " Coordinate y= " +y;
    }

}