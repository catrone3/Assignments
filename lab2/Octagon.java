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

// Do the Following: 
// Octagon is a derived class of GeometricObject, it implements Comparable and Cloneable interfaces.
// implement compareTo, clone, equals, and toString methods.
// Add Javadoc as shown in Circle class and remove all comment lines added by Dr.H.

public class Octagon extends GeometricObject implements Cloneable, Comparable{ 

    private double side;
    /*
    Implements a base length of 1 if one is not given
    */
    public Octagon() {
        this.side = 1.0;
    }
    /*
    Set side length if one is given
    */
    public Octagon(double side) {
        this.side = side;
    }

    /*
    Implements get area for a Octagon
    returns the result of the equation for an area of an octagon
    */
    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    /*
    find the perimeter of octagon by 8*side
    */
    @Override
    public double getPerimeter() {
        return 8 * side;
    }
    /**
     * Overrides the toString() method defined in the Object class.
     *
     * @return this Octagon's side is returned as String representation.
     * <p>Also see {@link Object#toString()}</p>
     */
    @Override
    public String toString() {
        return "[Octagon] side length = " + side;
    }

    /**
     * Two Circles are compared based on the area of circles.
     *
     * @param obj: circle being compared to this circle
     * @return see {@link Comparable#compareTo(java.lang.Object)}
     */
    @Override
    public int compareTo(Object obj) {
        if (this.getArea() > ((Octagon) obj).getArea()) {
            return 1;
        } else if (this.getArea() < ((Octagon) obj).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    /**
     * Two Octagon are equal if they have the same side length.
     *
     * @param obj : Octagon being compared to this octagon
     * @return true if the two octagons have the same side length
     * <p>Also see {@link Object#equals(java.lang.Object)}</p>
     */
    @Override
    public boolean equals(Object obj) {
        return this.side == ((Octagon) obj).side;
    }
    /**
     * Produces a clone of this Circle
     *
     * @return cloned object as a Circle
     * <p>Also see {@link Object#clone()}</p>
     */
    @Override
    public Octagon clone() { //
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
