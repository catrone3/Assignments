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
/* Assumes a proper triangle.
 * EquilateralTriangle is a GeometricObject.
 * EquilateralTriangles are Comparable and Cloneable
 * Must contain Overloaded constructors
 * Add Javadoc as shown in Circle class 
 * Remove all comment lines added by Dr.H.
 */

public class EquilateralTriangle extends GeometricObject implements Cloneable, Comparable{
    
    
    private double side;
    /*
    Implements a base length of 1 if one is not given
    */
    public EquilateralTriangle() {
        this.side = 1.0;
    }
    /*
    Set side length if one is given
    */
    public EquilateralTriangle(double side) {
        this.side = side;
    }

    /*
    Implements get area for a EquilateralTriangle 
    returns the result of the equation for an area of an EquilateralTriangle 
    */
    @Override
    public double getArea() {
        return ((1/4)*Math.sqrt(3)*(side*side));
    }

    /*
    find the perimeter of EquilateralTriangle  by 8*side
    */
    @Override
    public double getPerimeter() {
        return 3 * side;
    }
    /**
     * Overrides the toString() method defined in the Object class.
     *
     * @return this EquilateralTriangle 's side is returned as String representation.
     * <p>Also see {@link Object#toString()}</p>
     */
    @Override
    public String toString() {
        return "[EquilateralTriangle] side length = " + side;
    }

    /**
     * Two Circles are compared based on the area of circles.
     *
     * @param obj: circle being compared to this circle
     * @return see {@link Comparable#compareTo(java.lang.Object)}
     */
    @Override
    public int compareTo(Object obj) {
        if (this.getArea() > ((EquilateralTriangle) obj).getArea()) {
            return 1;
        } else if (this.getArea() < ((EquilateralTriangle) obj).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    /**
     * Two EquilateralTriangle are equal if they have the same side length.
     *
     * @param obj : EquilateralTriangle being compared to this EquilateralTriangle
     * @return true if the two EquilateralTriangles have the same side length
     * <p>Also see {@link Object#equals(java.lang.Object)}</p>
     */
    @Override
    public boolean equals(Object obj) {
        return this.side == ((EquilateralTriangle) obj).side;
    }
    /**
     * Produces a clone of this Circle
     *
     * @return cloned object as a Circle
     * <p>Also see {@link Object#clone()}</p>
     */
    @Override
    public EquilateralTriangle clone() { //
        try {
            return (EquilateralTriangle) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
