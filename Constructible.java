package medev_tp;

//classe constructible hérite classe Achetable
public class Constructible extends Achetable{
    private int NbMaisons;
    private int NbHotels;
    public int getNbMaisons() {
		return NbMaisons;
	}
    public void setNbMaisons(int NbMaisons) {
		this.NbMaisons = NbMaisons;
	}
    public int getNbHotels() {
		return NbHotels;
	}
    public void setNbHotels(int NbHotels) {
		this.NbHotels = NbHotels;
    }
    public int calculerLoyer(){
    int loyer;
    loyer = this.getEmplacement()*50+this.NbMaisons*100+this.NbHotels*600;
    return loyer; 
}
}
