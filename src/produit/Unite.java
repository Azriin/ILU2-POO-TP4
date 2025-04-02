package produit;

public enum Unite {
	GRAMME("g"),
	KILOGRAMME("kg"), 
	LITRE("l"), 
	CENTILITRE("cl"), 
	MILLILITRE("ml"), 
	PIECE("piece");

	private String unite;
	
	Unite(String unite) {
		this.unite = unite;
	}
	
	public String getUnite() {
		return unite;
	}
}