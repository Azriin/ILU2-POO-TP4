package produit;

public class Poisson extends Produit{
	private String datePeche;
	
	public Poisson(String datePeche) {
		super.nom = "poisson";
		super.unite = Unite.PIECE;
		this.datePeche = datePeche;	
	}
	
	@Override
	public void decrireProduit() {
		System.out.println("Poisson peches " + datePeche);	
	}
}
