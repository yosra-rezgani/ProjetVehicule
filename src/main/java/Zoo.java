import java.util.ArrayList;

public class Zoo {
    private String directeur;

    private ArrayList animaux; // Tableau des annimaux : 1 zoo peut avoir plusieurs annimaux (Cardinalité déduite du diagramme)



    public Zoo (String nouveauDirecteur) {

        this.directeur = nouveauDirecteur;

        this.animaux = new ArrayList();

    }


    /**
     * Ajouter annimal
     * @param nouvelAnimal
     */
    public void ajouterAnimal (Animal nouvelAnimal) {

        this.animaux.add(nouvelAnimal);

    }


    /**
     * => retourne une collection contenant des chaînes de caractères.
     * Chaque chaîne de caractères contient le nom de l’animal et le cri (de joie) qu’il a poussé lorsqu’on l’a nourri
     * les animaux morts ne crient pas et ne mangent pas).
     * @return
     */
    public ArrayList nourrir() {

        ArrayList cris = new ArrayList();

        for (int i=0; i < this.animaux.size() ; i++) {

            Animal animalCourant = (Animal)(animaux.get(i));

            if (animalCourant.estVivant()){

                String cri="nourrir "+(animalCourant.getNom())+" "+(animalCourant.getEspece().getCri());

                cris.add(cri);

            }

        }

        return cris;

    }}
