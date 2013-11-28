package ex4.form2d;

public class Ellipse extends Forme2D{

	double r1;
	double r2;

	public Ellipse(String nom, double x, double y, double r1, double r2) {
		super(nom, x, y);
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public double perimetre() {
		return 2* Math.PI * Math.sqrt( 0.5 * (r1*r1 + r2*r2));
	}

	@Override
	public double surface() {
		return r1 * r2 * Math.PI;
	}

	public String toString()
	{
		String S = id +" : une ellipse de rayon r1 " + r1 + " et de rayon r2 " + r2 + ".\n";
		S += "Surface : " + surface() + " unites";
		S += "Perimetre : " + perimetre() + " unites";
 		return S;
	}
}
