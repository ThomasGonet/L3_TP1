package ex3bis.immobilier;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import ex3bis.impotsLocaux.Adresse;

public abstract class Habitation {
	protected String id;
	protected Adresse ad;
	protected String proprietaire;
	protected String descriptif;
	protected int surface;
	protected GregorianCalendar dateConstruction;
	protected static int nbInstance;
	
	public Habitation(Adresse adresse, String proprietaire, String descriptif, int surface, GregorianCalendar date)
	throws ConsException
	{
		if( proprietaire == "" || proprietaire == null )
			throw new ConsException("Erreur prop");
		else if( surface <= 0)
			throw new ConsException("Erreur Surface");
		else if( adresse == null )
			throw new ConsException("Adresse invalide");
		else if( date == null)
			throw new ConsException("Date invalide");
		else
		{
			this.id = "hab" + nbInstance;
			this.ad = adresse;
			this.descriptif = descriptif;
			this.proprietaire = proprietaire;
			this.surface=surface;
			this.dateConstruction = date;
			nbInstance++;
		}
	}
	
	public Habitation(Adresse adresse, String proprietaire, String descriptif, GregorianCalendar date) throws ConsException, SurfException
	{
		this(adresse, proprietaire, descriptif, 0, date);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the ad
	 */
	public Adresse getAd() {
		return ad;
	}

	/**
	 * @return the surface
	 */
	public int getSurface() {
		return surface;
	}
	
	/**
	 * @return the number of instance
	 */

	public static int getNbInstance()
	{
		return nbInstance;
	}

	/**
	 * @return the proprietaire
	 */
	public String getProprietaire() {
		return proprietaire;
	}

	/**
	 * @param proprietaire the proprietaire to set
	 */
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	/**
	 * @return the descriptif
	 */
	public String getDescriptif() {
		return descriptif;
	}

	/**
	 * @param descriptif the descriptif to set
	 */
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	
	public GregorianCalendar getDateC()
	{
		return dateConstruction;
	}

	public String toString()
	{
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return id + " " + ad + " " + proprietaire + " " + surface + " " + descriptif + " " + df.format(dateConstruction.getTime()) + "  ";
		
	}
	
	public static boolean plusAncienne(Habitation h1, Habitation h2)
	{
		return h1.getDateC().before(h2.getDateC());
	}
	
	public boolean plusAncienneQue(Habitation h)
	{
		return this.getDateC().before(h.getDateC());
	}
	
	public boolean equals(Object o)
	{
		Habitation hab = (Habitation) o;
		return this.ad == hab.getAd() && this.proprietaire == hab.getProprietaire() && this.surface == hab.getSurface() && this.getDateC().equals(hab.getDateC());
	} 
	
	public abstract int impot();
	
}
