/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp;

import java.util.ArrayList;

/**
 *
 * @author Ruizo
 */
public class Joueur {
    private int fortune;
    private boolean[] casesPossedees;
    private String nom;
    private int nbToursDePrison ;
    private int position;
    private Plateau partie;

    public Joueur(){
        this.fortune = 100000;
        this.casesPossedees = new boolean[40];
        this.nom = "";
        this.nbToursDePrison = -1;
        this.position = 0;
        this.partie = new Plateau();
    }
    
    public Joueur(Joueur j){
        this.fortune = j.fortune;
        this.casesPossedees = j.casesPossedees;
        this.nom = j.nom;
        this.nbToursDePrison = j.nbToursDePrison;
        this.position = j.position;
        this.partie = j.partie;
        
    }
    
    public Joueur(int fortune, boolean[] casesPossedees, String nom, int nbToursDePrison, int position, Plateau partie) {
        this.fortune = fortune;
        this.casesPossedees = casesPossedees;
        this.nom = nom;
        this.nbToursDePrison = nbToursDePrison;
        this.position = position;
        this.partie = partie;
    }

    public int getFortune() {
        return fortune;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public boolean[] getCasesPossedees() {
        return casesPossedees;
    }

    public void setCasesPossedees(boolean[] casesPossedees) {
        this.casesPossedees = casesPossedees;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbToursDePrison() {
        return nbToursDePrison;
    }

    public void setNbToursDePrison(int nbToursDePrison) {
        this.nbToursDePrison = nbToursDePrison;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Plateau getPartie() {
        return partie;
    }

    public void setPartie(Plateau partie) {
        this.partie = partie;
    }
    
    
}
