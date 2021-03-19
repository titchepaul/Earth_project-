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
    
     Vaisseau[][] vaisseauxAccostes;
    int totalVisiteurs;

    public PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        vaisseauxAccostes = new Vaisseau[tailleBaie][tailleBaie];
    }

    boolean restePlaceDisponible(Vaisseau vaisseau) {
        TypeVaisseau typeVaisseau=vaisseau.type;
        int indexCategorie = 0;
        switch (typeVaisseau) {
            case CARGO:
            case VAISSEAUMONDE:
                indexCategorie = 1;
        }

        for (int i = 0; i < vaisseauxAccostes[indexCategorie].length; i++) {
            if (vaisseauxAccostes[indexCategorie][i] == null) {
                return true;
            }
        }
        return false;   
    }

    public void accueillirVaisseaux(Vaisseau... nouveauVaisseaux) {

        for (int j = 0; j < nouveauVaisseaux.length; j++) {
            if (nouveauVaisseaux[j] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) nouveauVaisseaux[j]).desactiverArmes();
            }

            totalVisiteurs += nouveauVaisseaux[j].nbPassagers;

            int indexCategorie = 0;
            switch (nouveauVaisseaux[j].type) {
                case CARGO:
                case VAISSEAUMONDE:
                    indexCategorie = 1;
            }

            for (int i = 0; i < vaisseauxAccostes[indexCategorie].length; i++) {
                if (vaisseauxAccostes[indexCategorie][i] == null) {
                    vaisseauxAccostes[indexCategorie][i] = nouveauVaisseaux[j];
                    break;
                }
            }
        }
    }
}
