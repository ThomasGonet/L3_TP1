package ex4.form3d;

public class Cylindre extends Forme3D{

	double rayon;
	double hauteur;

	public Cylindre(String nom, double rayon, double hauteur) {
		super(nom);
		this.rayon = rayon;
		this.hauteur = hauteur;
	}

	@Override
	public double volume() {
		return rayon * rayon * Math.PI * hauteur;
	}

	@Override
	public double surface() {
		return 2 * Math.PI * rayon * ( hauteur + rayon);
	}

	public String toString()
	{
		String S = id +" est un cylindre de rayon " + rayon + " et de hauteur "+ hauteur +".\n";
		S += "Surface : " + surface() + " unites\n";
		S += "Volume: " + volume() + " unites";
 		return S;
	}

}
