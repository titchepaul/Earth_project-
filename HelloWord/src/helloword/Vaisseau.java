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
public abstract class Vaisseau {
    
    TypeVaisseau type;
    int nbPassagers;
    int resistanceDuBouclier;
    int blindage;
    int tonnageMax;
    int tonnageActuel;
    
    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+type+".");
    }
    
    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type "+type+".");
    }

    abstract int emporterCargaison(int tonnage);
        
}
