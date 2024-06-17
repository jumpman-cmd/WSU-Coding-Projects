package za.ac.wsu.s221274650;

public class Circle
{
	private float circleRadius;
	private int circleX_Coordinate, circleY_Coordinate;
	
	
	//Constructors
	public Circle()
	{
		circleRadius = 1;
		circleY_Coordinate = circleX_Coordinate = 0;
	}
	
	public Circle(float radius)
	{
		this.circleRadius = radius;
	}
	
	public Circle(float radius, int x_Coordinate, int y_Coordinate)
	{
		this.circleRadius = radius;
		this.circleX_Coordinate = x_Coordinate;
		this.circleY_Coordinate = y_Coordinate;
	}
	
	
	//Circle Methods
	public float calculateArea()
	{	
		float circleArea = (float) (Math.PI * Math.pow(circleRadius, 2));
		
		return circleArea;
	}  

	public float calculateCircumference()
	{
		float circleCircumference = (float) (2 * Math.PI * circleRadius);
		
		return circleCircumference;
	}
	
	public float calculateDiameter()
	{
		float circleDiameter = 2 * circleRadius;
		
		return circleDiameter;
	}
	
	
	//Mutator Methods
	public void setCircleRadius(float radius)
	{
		circleRadius = radius;
	}
	
	public void setCircleX_Coordinate(int x_Coordinate)
	{
		circleX_Coordinate = x_Coordinate;
	}
	
	public void setCircleY_Coordinate(int y_Coordinate)
	{
		circleY_Coordinate = y_Coordinate;
	}
	
	
	//Accessor Methods
	public float getCircleRadius()
	{
		return circleRadius;
	}
	
	public int getCircleX_Coordinate()
	{
		return circleX_Coordinate;
	}
	
	public int getCircleY_Coordinate()
	{
		return circleY_Coordinate;
	}
}