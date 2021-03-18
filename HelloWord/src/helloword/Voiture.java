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
public class Voiture {
    int nbPortes =5;
    boolean automatique;
    String couleur;
    int rapportCourant;
    
    Moteur moteur;
    
    void klaxonner(){
        System.out.println("Tutu");
    }
    int accelerer(){
        System.out.println("accelerer");
        return 100;
    }
    int passerRapport(boolean augmenter){
        if(augmenter){
            rapportCourant++;
        }else{
            rapportCourant--;
        }
        return rapportCourant;
    }
    void tourner(boolean droite, int angle){
        String droiteOuGauche = null;
        if(droite){
            droiteOuGauche = "droite";
        }else{
            droiteOuGauche = "gauche";
        }
        System.out.println("La voiture va tourner à "+droiteOuGauche + " d'un angle de "+angle);
    }
    void transporter(Passager passager){
        System.out.println("je transporte un passager qui se nomme "+ passager.nom + " "+passager.prenom);
    }
}
