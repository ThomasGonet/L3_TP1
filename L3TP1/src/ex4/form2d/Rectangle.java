package ex4.form2d;

public class Rectangle extends Forme2D{

	double longueur;
	double largeur;

	public Rectangle(String nom, double x, double y, double longueur, double largeur) {
		super(nom, x, y);
		this.longueur = longueur;
		this.largeur = largeur;

	}

	@Override
	public double perimetre() {
		return longueur*2 + largeur*2;
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

	public String toString()
	{
		String S = id +"  : un rectangle de " + longueur + " de longueur et de " + largeur + " de largeur.\n";
		S += "Surface : " + surface() + " unites";
		S += "Perimetre : " + perimetre() + " unites";
 		return S;
	}

}
