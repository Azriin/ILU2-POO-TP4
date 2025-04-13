package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private Gaulois chasseur;
	private int poids;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super.nom = "sanglier";
		super.unite = Unite.KILOGRAMME;
		this.chasseur = chasseur;
		this.poids = poids;
	}
	
	@Override
	public String decrireProduit() {
		return "sanglier de " + poids +" kg chass� par " + chasseur.getNom() + ".";
	}

	@Override
	public int calculerPrix(int prix) {
		return poids*prix;
	}
}
