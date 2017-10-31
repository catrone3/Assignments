/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author wschottl
 */

/**
 * The
 * <code>GeometricObject</code> class is the super class of all geometric shapes
 * in this package. Derived classes must implement getArea and getPerimeter.
 *
 * @author Daniel Liang
 * @since Spring 2013
 */
public abstract class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object for implicit invocation. Sets
     * creation date of this geometric object
     *
     */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with color and filled value Sets creation
     * date of this geometric object
     *
     * @param color : color of this geometric object
     * @param filled : is this object is filled or not.
     */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * @return a string representation of this object
     */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + " and filled: " + filled;
    }

    /**
     * Abstract method getArea. Must be implemented by sub classes of
     * GeometricObject
     *
     * @return area of this geometric object
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter. Must be implemented by sub classes of
     * GeometricObject
     *
     * @return perimeter of this geometric object
     */
    public abstract double getPerimeter();
}
