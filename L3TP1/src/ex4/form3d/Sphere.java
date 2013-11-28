package ex4.form3d;

public class Sphere extends Forme3D{

	double rayon;

	public Sphere(String nom, double rayon) {
		super(nom);
		this.rayon = rayon;
	}

	@Override
	public double volume() {
		return ( 4 * Math.PI * rayon * rayon * rayon ) / 3;
	}

	@Override
	public double surface() {
		return 4 * Math.PI * rayon * rayon;
	}

	public String toString()
	{
		String S = id + " est une sphere de rayon " + rayon + ".\n";
		S += "Surface : " + surface() + " unites";
		S += "Volume: " + volume() + " unites";
 		return S;
	}

}
