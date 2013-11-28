package ex3bis.immobilier;

import java.util.GregorianCalendar;
import java.util.ArrayList;

import ex3bis.impotsLocaux.Adresse;

public class TestHab {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Adresse ad1 = new Adresse( 2, "lll", "20600", "nnn");
		GregorianCalendar d1 = new GregorianCalendar(1990, 9, 15);
		
//		Habitation hab1 = null;
//		Habitation hab2 = null;
//		
//		try{
//		hab1 = new Habitation( ad1, "tom", "jhgfhjk", 50, d1);
//		}
//		catch(ConsException e){};
//		
		Adresse ad2 = new Adresse( 2, "du Cours", "20250", "C0rte");
		GregorianCalendar d2 = new GregorianCalendar(1992, 9, 15);
//		try{
//		hab2 = new Habitation( ad1, "tom", "jhgfhjk", 50, d2);
//		}
//		catch(ConsException e){};
		
		ArrayList<Habitation> hh = new ArrayList<Habitation>();
		
		Habitation h1 = null, h2 = null, h3 = null;
		
		try{
		h1 = new HabitationIndividuelle( ad2, "tom", "Maison individuelle 1", 50, d2, 5, true);
		}
		catch(ConsException e){};

		try{
		h2 = new HabitationProfessionnelle( ad2, "tom", "Local pro 1", 50, d2, 25);
		}
		catch(ConsException e){};

		try{
		h3= new HabitationProfessionnelle( ad2, "tom", "Local pro 2", 50, d2, 8);
		}
		catch(ConsException e){};
		
		hh.add(h1);
		hh.add(h2);
		hh.add(h3);
		
//		if(hab1.plusAncienneQue(hab2))
//		{
//			System.out.println("vrai");
//		}
//		
//		if(hab1.equals(hab2))
//		{
//			System.out.println("Egales");
//		}
		
		int S = 0;
		
		for(Habitation h : hh)
		{
			S += h.impot();
		}
		System.out.println("Somme :" + S);
		
		hh = null;
	}

}
