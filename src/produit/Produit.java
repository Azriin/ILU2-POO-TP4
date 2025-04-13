package produit;

public abstract class Produit implements lProduit{
	protected String nom;
	protected Unite unite;
	
	public String getNom() {
		return nom;
	}
	
	public abstract String decrireProduit();
	public abstract int calculerPrix(int prix);
}
