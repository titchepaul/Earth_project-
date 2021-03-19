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
public enum TypeVaisseau {
    
     CHASSEUR("Chasseur"), FREGATE("Frégate"), CROISEUR("Croiseur"), CARGO("Cargo"), VAISSEAUMONDE("Vaisseau-Monde");
    public String nom;

    TypeVaisseau(String nom) {
        this.nom = nom;
    }
}
