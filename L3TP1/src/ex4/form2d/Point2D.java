package ex4.form2d;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public void setP(double x, double y)
	{
		this.x = x; this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public String toString()
	{
		return "( " + x + " ; " + y + " )";
	}
}
