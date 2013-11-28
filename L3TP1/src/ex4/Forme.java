package ex4;

//test

public abstract class Forme{

	protected final String id;
	private static int nbInstance = 1;

	public Forme(String nom)
	{
		id = nom + "_" + nbInstance;
		Forme.nbInstance++;
	}

	public abstract double surface();

	public boolean plusGrand(Forme f)
	{
		return this.surface() > f.surface();
	}
}
