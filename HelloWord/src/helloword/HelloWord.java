/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

/**
 *
 * @author pault
 */
public class HelloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture voitureDeMichel = new Voiture();
        voitureDeMichel.couleur = "vert";
        voitureDeMichel.automatique = true;
        voitureDeMichel.nbPortes = 3;
        
        int rapportNouveau = voitureDeMichel.passerRapport(true);
        System.out.println("Mon nouveau rapport : "+rapportNouveau);
        
        voitureDeMichel.tourner(true, 45);
        
        Voiture voitureDeJerome = new Voiture();
        voitureDeJerome.nbPortes=5;
        
        Moteur moteur = new Moteur();
        moteur.carburation="DIESEL";
        moteur.nbCylindre=6;
        
        voitureDeJerome.moteur = moteur;
         Passager passager = new Passager();
         passager.nom = "Dupond";
         passager.prenom = "Alain";
         voitureDeJerome.transporter(passager);
         //System.out.println("");
    }
    
}
