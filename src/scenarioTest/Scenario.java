package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import produit.lProduit;
import villagegaulois.Etal;
import villagegaulois.IEta;
import villagegaulois.IEtal;
import villagegaulois.IVillage;

public class Scenario {

	public static void main(String[] args) {

		// TODO Partie 4 : creer de la classe anonyme Village
		IVillage village = new IVillage() {
			private IEtal[] marche = new IEtal[3];
			private int nbEtals = 0;
			
			
			@Override
			public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
				if (nbEtals < marche.length) {
					etal.installerVendeur(vendeur, produit, prix);
					marche[nbEtals] = etal;
					nbEtals++;
					return true;
				}
				return false;
			}

			@Override
			public void acheterProduit(String produit, int quantiteSouhaitee) {
				int quantiteRestante = quantiteSouhaitee;
				for (int i = 0; i < nbEtals && quantiteRestante != 0; i++) {
					IEtal etal = marche[i];
					int quantiteDisponible = etal.contientProduit(produit, quantiteRestante);
					if (quantiteDisponible != 0) {
						int prix = etal.acheterProduit(quantiteDisponible);
						System.out.println("A l'étal n° " + (i + 1) + ", j'achete " + quantiteDisponible + " " + produit
								+ " et je paye " + prix + " sous.");
						quantiteRestante -= quantiteDisponible;
					}
				}
				System.out.println("Je voulais " + quantiteSouhaitee + " " + produit + ", j'en ai acheté "
						+ (quantiteSouhaitee - quantiteRestante) + ".");
			}
			
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < nbEtals; i++) {
					sb.append(marche[i].etatEtal() + "\n");
				}
				return sb.toString();
			}
		};
		// fin

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };
		
		
		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		village.acheterProduit("sanglier", 3);

		System.out.println(village);
	}

}
