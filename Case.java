package medev_tp;

public abstract class Case{
	private String nom; // nom de cette case
	private int emplacement; // emplacement de cette case
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(int emplacement) {
		this.emplacement = emplacement;
	}
	public abstract String toString(); // methode toString()
}
