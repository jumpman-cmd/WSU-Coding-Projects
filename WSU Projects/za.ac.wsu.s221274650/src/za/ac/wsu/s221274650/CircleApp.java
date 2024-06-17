package za.ac.wsu.s221274650;

public class CircleApp
{
	public static void main(String args[])
	{
		//Circle object 1
	Circle c1 = new Circle();
	System.out.println("Cirle object 1:");
	System.out.println("Radius: " + c1.getCircleRadius());
	System.out.println("X and Y Coordinates: " + c1.getCircleX_Coordinate() + ", " + c1.getCircleY_Coordinate());
	System.out.println("Area: " + c1.calculateArea());
	System.out.println("Circumference: " + c1.calculateCircumference());
	System.out.println("Diameter: " + c1.calculateDiameter());
	

	    //Circle object 2
	Circle c2 = new Circle(8);
	System.out.println("\nCirle object 2:");
	System.out.println("Radius: " + c2.getCircleRadius());
	System.out.println("X and Y Coordinates: " + c2.getCircleX_Coordinate() + ", " + c2.getCircleY_Coordinate());
	System.out.println("Area: " + c2.calculateArea());
	System.out.println("Circumference: " + c2.calculateCircumference());
	System.out.println("Diameter: " + c2.calculateDiameter());
	
	
	    //Circle object 3
	Circle c3 = new Circle(28, 21, 10);
	System.out.println("\nCirle object 3:");
	System.out.println("Radius: " + c3.getCircleRadius());
	System.out.println("X and Y Coordinates: " + c3.getCircleX_Coordinate() + ", " + c3.getCircleY_Coordinate());
	System.out.println("Area: " + c3.calculateArea());
	System.out.println("Circumference: " + c3.calculateCircumference());
	System.out.println("Diameter: " + c3.calculateDiameter());
	}
}