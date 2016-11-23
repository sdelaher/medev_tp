/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp;

/**
 *
 * @author Ruizo
 */
public class Joueur {

    private int fortune;
    private boolean[] casesPossedees;
    private String nom;
    private int nbToursDePrison;
    private int position;
    private Plateau plateau;

    public Joueur() {
        this.fortune = 100000;
        this.casesPossedees = new boolean[40];
        this.nom = "";
        this.nbToursDePrison = -1;
        this.position = 0;
        this.plateau = new Plateau();
    }

    public Joueur(Joueur j) {
        this.fortune = j.fortune;
        this.casesPossedees = j.casesPossedees;
        this.nom = j.nom;
        this.nbToursDePrison = j.nbToursDePrison;
        this.position = j.position;
        this.plateau = j.plateau;
        
    }

    public Joueur(int fortune, boolean[] casesPossedees, String nom, int nbToursDePrison, int position, Plateau plateau) {
        this.fortune = fortune;
        this.casesPossedees = casesPossedees;
        this.nom = nom;
        this.nbToursDePrison = nbToursDePrison;
        this.position = position;
        this.plateau = plateau;
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

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public static int lancerDes() {
        return ((int) Math.floor(Math.random() * 6)) + 1;
    }

    public void acheter(Case c) {
        if (c instanceof Achetable) {
            if (this.casesPossedees[c.getEmplacement()] == true) {
                if (this.fortune >= ((Achetable)c).getPrix()) {
                    this.fortune = this.fortune - ((Achetable)c).getPrix();
                    this.casesPossedees[c.getEmplacement()] = true;
                } else {
                    System.out.println("Cette case est trop chère pour toi...");
                }
            }
            else {
                System.out.println("Cette case est déjà à toi!");
            }

        } else {
            System.out.println("Cette case ne peut pas être achetée!");
        }
    
    public void sortirPrison(){
        if (this.fortune> 50){
        this.fortune -= 50; //caution
        this.nbToursDePrison = -1;
        System.out.println("Vous êtes libre, le prochain tour vous pouvez bouger dans le prochain tour");
        }
        else{
            System.out.println("Vous n'avez pas d'argent pour sortir de prison");
        }
    }
    
    public void payer (Case c){
        int debit;
        Joueur debiteur = c.getJoueur();
        if (c instanceof Gare){
            debit = c.nbGares(debiteur);
        }
        else if (c instance of Constructible){
            debit = c.getEmplacement() * 50 + c.getNombreMaison() * 100 + c.getNombreHotel() * 600;
        }
        if (debit > this.fortune){
            System.out.println("");
        }
        
    }
}
