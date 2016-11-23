package medev_tp;

public class Communaute extends Case{
	// une sous-classe de Case
	private int prix; // prix

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String toString(){
		String prixString = "" + prix; // transforme prix a int
		String retourne = getNom() + prixString;
		return retourne;
	}
}

