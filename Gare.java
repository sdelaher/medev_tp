package medev_tp;

// gare hérite les attributs et les méthodes par classe abstraite Achetable
public class Gare extends Achetable{
    @override 
    public int calculerLoyer(){
        int loyer;
        loyer = 2500*this.Proprietaire().getPlateau().nbGares(this.proprietaire);
        return loyer;
    }
   
}
