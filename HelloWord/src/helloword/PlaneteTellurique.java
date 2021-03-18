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
public class PlaneteTellurique extends Planete implements Habitable{
    
    Vaisseau vaisseauAccoste;
    int totalVisiteurs;

    public PlaneteTellurique(String nom) {
        super(nom);
    }
    
    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau){
        
        if (nouveauVaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre)nouveauVaisseau).desactiverArmes();
        }
        
        totalVisiteurs+=nouveauVaisseau.nbPassagers;
        
        Vaisseau vaisseauPrecedent=vaisseauAccoste;
        
        vaisseauAccoste=nouveauVaisseau;
        
        return vaisseauPrecedent;
        
    }
}
