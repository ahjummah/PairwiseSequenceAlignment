
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jessa
 */
class Point {

    private int x;
    private int y;
    private double value;
    private ArrayList<Point> origins = new ArrayList<Point>();

    Point(int x, int y, double value) {
        this.x = x;
        this.y = y;
        this.value = value;

    }

    public void addOrigin(Point origin) {
        getOrigins().add(origin);

    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the origins
     */
    public ArrayList<Point> getOrigins() {
        return origins;
    }

    /**
     * @param origins the origins to set
     */
    public void setOrigins(ArrayList<Point> origins) {
        this.origins = origins;
    }

}