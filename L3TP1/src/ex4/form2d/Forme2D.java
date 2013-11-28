package ex4.form2d;

import ex4.Forme;

public abstract class Forme2D extends Forme implements Drawable{

	Point2D origine;

	public Forme2D(String nom, double x, double y) {
		super(nom);
		origine = new Point2D(x, y);
		// TODO Auto-generated constructor stub
	}

	public abstract double perimetre();

	public Point2D getPosition()
	{
		return origine;
	}

	public void move(double dx, double dy)
	{
		origine.setP((origine.getY() + dx ), (origine.getY() + dy));
	}

	public void dessineToi()
	{
		System.out.println("le curseur se positionne au point " + origine +" et dessine " + this);
	}

}
