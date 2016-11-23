/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author valentinricher
 */
public class Plateau {

     /**
     * @auhtor valentinricher
     */
    private ArrayList<Case> liste;
    private LinkedList<Joueur> joueurs;
    
    /**
     * @author valentinricher
     * Getter de liste
     * @return liste, l'ArrayList des Cases
     */
    public ArrayList<Case> getListe(){
        return liste;
    }
    
    /**
     * @author valentinricher
     * Setter de liste
     * @param l est l'ArrayList de Cases pris en paramètre
     */
    public void setListe(ArrayList<Case> l){
        liste = l;
    }
    
    /**
     * @author valentinricher
     * @return la liste chainee joueurs
     */
    public LinkedList<Joueur> getJoueurs(){
        return joueurs;
    }
    
    public void setJoueurs(LinkedList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    
    
    /*
    Constructeurs
    */
    
    public Plateau(){
        ArrayList<Case> nouveauPlateau = new ArrayList<Case>();
       nouveauPlateau.add(new Case("depart",0));
       nouveauPlateau.add(new Case("1",1));
       nouveauPlateau.add(new Case("Z",2));
       nouveauPlateau.add(new Case("3",3));
       nouveauPlateau.add(new Case("4",4));
       nouveauPlateau.add(new Case("gare 1",5));
       nouveauPlateau.add(new Case("6",6));
       nouveauPlateau.add(new Case("7",7));
       nouveauPlateau.add(new Case("8",8));
       nouveauPlateau.add(new Case("9",9));
       nouveauPlateau.add(new Case("10",10));
       nouveauPlateau.add(new Case("11",11));
       nouveauPlateau.add(new Case("12",12));        
       nouveauPlateau.add(new Case("13",13));
       nouveauPlateau.add
    }
    
    
    public static int lanceLeDe(){
        return((int) Math.floor(Math.random()*6)+1);
    }

    /**
     * @author valentinricher
     * afficher() appelle les méthodes toString() de la classe Case
     */
    public void afficher() {
        for (int i=0; i<liste.size(); i++) {
            liste.get(i).toString();
        }
    }
    
    /**
     * @author valentinricher
     * nbGares() affiche le nombre de gares que possede un joueur
     * @param j est un Joueur
     * @return 
     */
    public int nbGares(Joueur j){
        //nb est le nombre de gares qui va servir de compteur
        int nb =0;
        boolean casesPossedees[] = j.getCasesPossedees();
        for (int i=0; i<casesPossedees.length;i++){
            if (casesPossedees[i]=true){
                nb += 1;
            }
        }
        return nb;   
    }
    
    /**
     * @author valentinricher
     * @return true (un booléen) si la partie est finie
     */
    public boolean finDePartie(){
        return joueurs.size() ==1;
    }
    
    
    
}
