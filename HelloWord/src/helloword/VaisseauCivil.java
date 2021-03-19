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
public class VaisseauCivil extends Vaisseau{
    
    
     public VaisseauCivil(TypeVaisseau type) {
        this.type = type;
        if (type == TypeVaisseau.CARGO) {
            tonnageMax = 500;
        } else if (type == TypeVaisseau.VAISSEAUMONDE) {
            tonnageMax = 2000;
        }

    }

    int emporterCargaison(int tonnage) {

        int tonnageRestant = tonnageMax - tonnageActuel;
        if (tonnage > tonnageRestant) {
            tonnageActuel = tonnageMax;
            return tonnage-tonnageRestant;
        }
        tonnageActuel+=tonnage;
        return 0;
    }

}
