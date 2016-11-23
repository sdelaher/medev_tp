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
    /*
    Attributs
    */
    protected ArrayList<Case> liste;
    protected LinkedList<Joueur> joueurs;
    
    /*
    Constructeurs
    */
    
    public Plateau(){
        
    }
    
    
    /*
    Méthode lanceLeDe()
    */
    
    public static int lanceLeDe(){
        return((int) Math.floor(Math.random()*6)+1);
    }
    
    /*
    Methode tourDeJeu()
    */
    public void tourDeJeu(){
        
    }
}
