package ex4.form2d;

public class Cercle extends Forme2D{

	double rayon;

	public Cercle(String nom, double x, double y, double rayon) {
		super(nom, x, y);
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2 * rayon * Math.PI;
	}

	@Override
	public double surface() {
		return rayon * rayon * Math.PI;
	}

	public String toString()
	{
		String S = id + " : un cercle de rayon " + rayon + ".\n";
		S += "Surface : " + surface() + " unites\n";
		S += "Perimetre : " + perimetre() + " unites";
 		return S;
	}
}
