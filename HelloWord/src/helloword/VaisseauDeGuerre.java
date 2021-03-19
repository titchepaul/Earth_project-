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
public class VaisseauDeGuerre extends Vaisseau{
    
     boolean armesDesactivees;

    public VaisseauDeGuerre(TypeVaisseau type){
        this.type=type;
        if (type.equals("CHASSEUR")){
            tonnageMax=0;
        }
        else if (type.equals("FREGATE")){
            tonnageMax=50;
        }
        else if (type.equals("CROISEUR")){
            tonnageMax=100;
        }
        
    }
    
    void attaque(Vaisseau vaisseauCible, String arme, int duree) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseauCible.type + " en utilisant l'arme " + arme + " pendant " + duree + " minutes.");
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }

    void desactiverArmes() {
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        armesDesactivees = true;
    }
    
    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+type+".");
        desactiverArmes();
    }

    int emporterCargaison (int cargaison){
	if (type.equals("CHASSEUR")){
            return cargaison;
        }
        else {
            if (nbPassagers<12){
                return cargaison;
            }
            else {
                int tonnagePassagers=nbPassagers*2;
                int tonnageRestant=tonnageMax-tonnageActuel;
                int tonnageAConsiderer=(tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
                if (cargaison>tonnageAConsiderer){
                    tonnageActuel=tonnageMax;
                    return cargaison-tonnageAConsiderer;
                }
                else {
                    tonnageActuel+=cargaison;
                    return 0;
                }
            }
        }
    }
}
