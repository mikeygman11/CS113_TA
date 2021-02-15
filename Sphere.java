package cs113;

/*
 * Class called sphere with instance data of the sphere's diameter, constructor with diameter, getter and setter for diameter, volume and surface area methods, and toSring, and driver class
 */

public class Sphere {
	
	private double diameter;
	
	//constructor
	public Sphere(double d) {
		diameter = d;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	public void setDiameter(double newDiameter) {
		diameter = newDiameter;
	}
	
	public double volume() {
		return (4.0/3.0) * Math.PI * (Math.pow((diameter/2.0), 3));
	}
	
	public double surfaceArea() {
		return (4.0) * Math.PI * (Math.pow((diameter/2.0), 2));
	}
	
	public String toString() {
		return "Sphere has diameter of " + diameter + ", volume of " + volume() + ", surface area of " + surfaceArea();
	}


}
