package ex4.form2d;

public interface Drawable {

	Point2D getPosition(); // retourne la position de la forme g�om�trique

	void move(double dx, double dy);
	 //ou dx et dy repr�sente le
	 // d�placement � faire subir � la
	 //forme g�om�trique

	void dessineToi();

}
