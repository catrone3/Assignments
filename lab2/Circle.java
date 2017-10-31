/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 * The
 * <code>Circle</code> class implements a Circle and contains several useful
 * class fields and methods. It can be instantiated.
 *
 * @author Suranga Hettiarachchi
 * @since Spring 2013
 */
public class Circle extends Ellipse implements Comparable, Cloneable {

    /**
     * radius of this Circle
     */
    private double radius;

    /**
     * default constructor sets radius to 1.0
     */
    public Circle() {
        super(1,1);
    }//circl

    /**
     * Overloaded constructor, calls super(a,b)
     *
     * @param radius: radius of this Circle set by client
     */
    public Circle(double radius) {
        super(radius, radius);
    }

	
    /**
     * Accesser of radius for this circle
     *
     * @return radius of this Circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Mutator of radius for this circle
     *
     * @param radius: set radius of this circle with client specified radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Implement the getArea method defined in GeometricObject
     *
     * @return this Circle's area - pi*rad^2
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Implement the getPerimeter method defined in GeometricObject
     *
     * @return this Circle's perimeter - 2*pi*rad
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Overrides the toString() method defined in the Object class.
     *
     * @return this Circle's radius is returned as String representation.
     * <p>Also see {@link Object#toString()}</p>
     */
    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }

    /**
     * Two Circles are compared based on the area of circles.
     *
     * @param obj: circle being compared to this circle
     * @return see {@link Comparable#compareTo(java.lang.Object)}
     */
    @Override
    public int compareTo(Object obj) {
        if (this.getArea() > ((Circle) obj).getArea()) {
            return 1;
        } else if (this.getArea() < ((Circle) obj).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Two Circles are equal if they have the same radius.
     *
     * @param obj : circle being compared to this circle
     * @return true if the two circles have the same radius
     * <p>Also see {@link Object#equals(java.lang.Object)}</p>
     */
    @Override
    public boolean equals(Object obj) {
        return this.radius == ((Circle) obj).radius;
    }

    /**
     * Produces a clone of this Circle
     *
     * @return cloned object as a Circle
     * <p>Also see {@link Object#clone()}</p>
     */
    @Override
    public Circle clone() { 
        return (Circle) super.clone();
    }
}
