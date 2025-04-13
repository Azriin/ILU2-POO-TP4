package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal {
	
	Gaulois getGaulois();
	int contientProduit(String produit, int quantiteSouhaitee);
	int acheterProduit(int quantiteSouhaite);
	String etatEtal();
}
