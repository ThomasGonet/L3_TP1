package ex3bis.immobilier;

import java.util.GregorianCalendar;

import ex3bis.impotsLocaux.Adresse;

public class HabitationIndividuelle extends Habitation{

	private int nbPieces;
	private boolean piscine;
	
	public HabitationIndividuelle(Adresse adresse, String proprietaire,
			String descriptif, int surface, GregorianCalendar date, int nbPieces, boolean piscine) throws ConsException {
		super(adresse, proprietaire, descriptif, surface, date);
		this.nbPieces = nbPieces;
		this.piscine = piscine;
		
	}
	
	public int impot()
	{
		if (piscine)
		{
			System.out.println( this + " impot " + ( 2* surface + 15 * nbPieces + 150));
			return 2* surface + 15 * nbPieces + 150;
		}
		else
		{
			System.out.println( this + " impot " + ( 2* surface + 15 * nbPieces));
			return 2* surface + 15 * nbPieces;
		}
	}

}
