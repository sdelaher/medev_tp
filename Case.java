package medev_tp;

public abstract class Case {

    private String nom; // nom de cette case
    private int emplacement; // emplacement de cette case
    
    public Case(){
        this.nom = ""; 
        this.emplacement = 0; 
    }

    public Case(Case c) {
        this.nom = c.nom;
        this.emplacement = c.emplacement;
    }
    
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

    /**
     *
     * @return le nom de la case
     */
    @Override
    public String toString() {
        // methode toString()
        return this.getNom();
    }
}
