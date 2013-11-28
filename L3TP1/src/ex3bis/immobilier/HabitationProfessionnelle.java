package ex3bis.immobilier;

import java.util.GregorianCalendar;

import ex3bis.impotsLocaux.Adresse;

public class HabitationProfessionnelle extends Habitation{
	
	private int nbEmployes;
	
	public HabitationProfessionnelle(Adresse adresse, String proprietaire,
			String descriptif, int surface, GregorianCalendar date, int nbEmployes) throws ConsException {
		super(adresse, proprietaire, descriptif, surface, date);
		this.nbEmployes = nbEmployes;
	}
	
	public int impot()
	{	
		System.out.println( this + " impot " + ( 2*surface + 150 * ( 1 + ((int) nbEmployes / 10))));
		return 2*surface + 150 * ( 1 + ((int) nbEmployes / 10));
	}

}
