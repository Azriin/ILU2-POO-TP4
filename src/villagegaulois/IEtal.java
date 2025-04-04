package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal <P extends Produit>{
	
	public boolean isEtalOccupe();
	public P getProduit();
	public Gaulois getVendeur();
	public int getQuantite();
}
