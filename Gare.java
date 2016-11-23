package medev_tp;

// gare hérite les attributs et les méthodes par classe abstraite Achetable
public class Gare extends Achetable{
    public int calculerLoyer(){
        int loyer;
        loyer = 2500*this.getProprietaire().getPlateau().nbGares(getProprietaire());
        return loyer;
    }
   
}
