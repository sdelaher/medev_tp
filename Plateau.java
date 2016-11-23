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
    /*
    Constructeurs
    */
    
    public Plateau(){
    }
    
    
    public static int lanceLeDe(){
        return((int) Math.floor(Math.random()*6)+1);
    }

    
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
       
    
    private ArrayList<Case> liste;
    private LinkedList<Joueur> joueurs;
    
    
}
