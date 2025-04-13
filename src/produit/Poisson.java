package produit;

public class Poisson extends Produit implements lProduit{
	private String datePeche;
	
	public Poisson(String datePeche) {
		super.nom = "poisson";
		super.unite = Unite.PIECE;
		this.datePeche = datePeche;	
	}
	
	@Override
	public String decrireProduit() {
		return "Poisson peches " + datePeche;	
	}

	@Override
	public int calculerPrix(int prix) {
		return prix;
	}
}
