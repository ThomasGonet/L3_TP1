package ex4;

import ex4.form2d.*;
import ex4.form3d.*;



public class TestForme {

	public static void main(String[] args) {

		Forme f1 = new Cercle("c", 0, 0, 1);
		Forme f2 = new Rectangle("r", 0, 0, 1, 2);

		System.out.println("surface c1 : " + f1.surface());
		if(f1.plusGrand(f2))
			System.out.println("Vrai");

		Forme f3 = new Cylindre ("cyl", 1, 2);

		System.out.println("surface c1 : " + f3.surface());

		if(f1.plusGrand(f3))
			System.out.println("Vrai");
		else
			System.out.println("faux");
		System.out.println(f1);
		System.out.println(f3);

		((Forme2D) f1).dessineToi();

		((Forme2D) f1).move(1,1);

		((Forme2D) f1).dessineToi();

		((Forme2D) f1).move(1,1);

		((Forme2D) f1).dessineToi();

		f1 = null;
		f2 = null;
		f3 = null;
	}

}
