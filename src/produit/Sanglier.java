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
	public void decrireProduit() {
		System.out.println("sanglier de " + poids +" kg chassé par " + chasseur.getNom() + ".");
	}
}
