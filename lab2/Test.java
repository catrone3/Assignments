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
// This code is incomplete, therefore it throws a java.lang.NullPointerException
public class Test {

    public static void main(String[] args) {

        Circle c1 = new Circle(1.3);
        Circle c2 = new Circle(2.1);
        System.out.println("Area of Circle c2 is " + c2.getArea());
        System.out.println("Perimeter of Circle c2 is " + c2.getPerimeter());
        if (c1.compareTo(c2) == 0) {
            System.out.println("Circle c1 and c2 have equal coverage of area");
        } else if (c1.compareTo(c2) > 0) {
            System.out.println("Circle c1 has larger area than the circle c2");
        } else {
            System.out.println("Circle c1 has smaller area than the circle c2");
        }
        Circle c3 = c2.clone();
        if (c2.compareTo(c3) == 0) {
            System.out.println("Circle c2 and c3 have equal coverage of area");
        } else if (c2.compareTo(c3) > 0) {
            System.out.println("Circle c2 has larger area than the circle c3");
        } else {
            System.out.println("Circle c2 has smaller area than the circle c3");
        }

        System.out.println("Circle c3 -->" + c3);


        // construct an Octagon
        // clone an Octagon
        // Write code to output area and perimeter, and compare Octagon objects o1 and o2.
        Octagon o1 = new Octagon(1.3);
        Octagon o2 = new Octagon(2.1);
        System.out.println("Area of Octagon o2 is " + o2.getArea());
        System.out.println("Perimeter of Octagon o2 is " + o2.getPerimeter());
        if (o1.compareTo(o2) == 0) {
            System.out.println("Octagon o1 and o2 have equal coverage of area");
        } else if (o1.compareTo(o2) > 0) {
            System.out.println("Octagon o1 has larger area than the Octagon o2");
        } else {
            System.out.println("Octagon o1 has smaller area than the Octagon o2");
        }
        Octagon o3 = o2.clone();
        if (o2.compareTo(o3) == 0) {
            System.out.println("Circle o2 and o3 have equal coverage of area");
        } else if (o2.compareTo(o3) > 0) {
            System.out.println("Circle o2 has larger area than the Octagon o3");
        } else {
            System.out.println("Circle o2 has smaller area than the Octagon o3");
        }

        System.out.println("Octagon o3 -->" + o3);

        // Construct a EquilateralTriangle 
        // clone an EquilateralTriangle
        // Write code to output area and perimeter, and compare EquilateralTriangle objects t1 and t2. 	    
	EquilateralTriangle e1 = new EquilateralTriangle(1.3);
        EquilateralTriangle e2 = new EquilateralTriangle(2.1);
        System.out.println("Area of EquilateralTriangle e2 is " + e2.getArea());
        System.out.println("Perimeter of EquilateralTriangle e2 is " + e2.getPerimeter());
        if (e1.compareTo(e2) == 0) {
            System.out.println("EquilateralTriangle e1 and e2 have equal coverage of area");
        } else if (e1.compareTo(e2) > 0) {
            System.out.println("EquilateralTriangle e1 has larger area than the EquilateralTriangle e2");
        } else {
            System.out.println("EquilateralTriangle e1 has smaller area than the EquilateralTriangle e2");
        }
        EquilateralTriangle e3 = e2.clone();
        if (e2.compareTo(e3) == 0) {
            System.out.println("EquilateralTriangle e2 and e3 have equal coverage of area");
        } else if (o2.compareTo(o3) > 0) {
            System.out.println("EquilateralTriangle e2 has larger area than the EquilateralTriangle e3");
        } else {
            System.out.println("EquilateralTriangle e2 has smaller area than the EquilateralTriangle e3");
        }

        System.out.println("EquilateralTriangle e3 -->" + e3);	
		
	// construct an Ellipse
        // clone an Ellipse
        // Write code to output area, perimeter, and eccentricity, and compare Ellipse objects e1 and e2.

/*
        GeometricObject[] geo = new GeometricObject[10];
        for (int i = 0; i < geo.length; i++) {
            if (Math.random() < 0.5) {
                geo[i] = new Circle(Math.random());
            }
            // extend the code to add Octagons, Ellipse, and EquilateralTriangle to array.
            // Each object should have an equal chance of getting inserted into the array
        }

        for (int i = 0; i < geo.length; i++) {
            System.out.println("Object being processed belongs to class " + geo[i].getClass());
            if (geo[i] instanceof Circle) {
                System.out.println("Confirming Object as a Circle");
            }
            // extend the code to check if an object in the array is an Octagons, Ellipse, or EquilateralTriangle. 
            // Output appropriate messages .
        }

        for (int i = 0; i < geo.length; i++) {
            System.out.println("Object at position" + i + " is " + geo[i].getClass() + " it contains -->" + geo[i]);
        }//i
*/
    }//main
}//class