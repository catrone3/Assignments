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

// Complete all methods
// Add JavaDoc with explanations.

public class Ellipse extends GeometricObject implements Eccentric, Comparable, Cloneable {
	
	double a, b;
        
        /*
        Implements a comparison of the two doubles entered to find which one is the major axis and which is the minor axis
        Major is then set to 'a' and minor is then set to 'b'
        */
	public Ellipse(double s1, double s2)
	{
		if(s1 < s2)
		{
			a = s2;
			b = s1;
		}
		else
		{
			a = s1;
			b = s2;
		}
	}
	
        /**
         * Implement the getPerimeter method defined in GeometricObject
         *
         * @return this Ellipse's perimeter - 2*pi*sqrt((a^2+b^2)/2)
        */
	public double getPerimeter()
	{
            return Math.PI*2*Math.sqrt(((a*a)+(b*b))/2);
		//method body missing
	}//perimeter of an ellipse
	
	/**
        * Implement the getArea method defined in GeometricObject
        *
        * @return this ellipse's area - pi*a*b
        */
        @Override
        public double getArea()
	{
            return Math.PI*a*b;
            //method body missing		
	}//area of an ellipse
	
        /*
        * Implements the eccentricity method defined in eccentric interface
        * @return this ellipse's eccentricity - sqrt((a^2-b^2)/a)
        */
        
	@Override
        public double eccentricity()
	{
            return Math.sqrt(((a*a)-(b*b))/a);
		//method body missing		
	}
	
        /*
        *setting toString for Ellipse displaying eccentricity;
        */
	@Override
        public String toString() {
            return "[Ellipse] Eccentricity = " + eccentricity();
        }
        
        /**
        * Two Circles are compared based on the area of circles.
         *
         * @param obj: circle being compared to this circle
         * @return see {@link Comparable#compareTo(java.lang.Object)}
         */
        @Override
        public int compareTo(Object obj) {
            if (this.getArea() > ((Ellipse) obj).getArea()) {
                return 1;
            } else if (this.getArea() < ((Ellipse) obj).getArea()) {
                return -1;
            } else {
                return 0;
            }
        }
        /**
        * Two ellipses are equal if they have the same major and minor axis'.
        *
        * @param obj : ellipse being compared to this ellipse
        * @return true if the two ellipse have the same major and minor axis
        * <p>Also see {@link Object#equals(java.lang.Object)}</p>
        */
        @Override
        public boolean equals(Object obj) {
            return this.a == ((Ellipse) obj).a && this.b == ((Ellipse) obj).b;
        }
        /**
        * Produces a clone of this Circle
        *
        * @return cloned object as a Circle
        * <p>Also see {@link Object#clone()}</p>
        */
        @Override
        public Ellipse clone() { //
            try {
                return (Ellipse) super.clone();
            } catch (CloneNotSupportedException ex) {
                return null;
            }
        }
}
