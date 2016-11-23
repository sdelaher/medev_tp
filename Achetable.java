
package medev_tp;

public abstract class Achetable extends Case{
    private int prix;
    private Joueur proprietaire;
    
    public void setPrix(int prix) {
		this.prix = prix;
    }

    public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
    }
    
    public abstract int calculerLoyer();
    
    public int getPrix() {
		return prix;
    }
    
    public Joueur getProprietaire() {
		return proprietaire ;
    }
    
}