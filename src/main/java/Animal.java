public class Animal {
    private String nom;

    private boolean vivant;

    private int age;

    Espece espece;


    /**
     * Constructeur qui valorise le nom et l’espèce de l’animal
     * @param sonNom
     * @param sonEspece
     */
    public Animal(String sonNom, Espece sonEspece) {

        nom = sonNom;

        vivant = true;

        age = 0;

        this.espece = sonEspece;

    }



    public String getNom() {

        return this.nom;

    }

    /**
     * * Indique si l’animal est vivant.
     * @return vivant
     */
    public boolean estVivant() {

        return this.vivant;

    }

    /**
     * indique si l’animal est vivant
     * @return espece de l'annimal
     */
    public Espece getEspece() {

        return this.espece;

    }

    /**
     *retourne le nom, le nom de l’espèce, le statut (vivant ou mort)
      ainsi que l’age (courant s’il est vivant, de décès s’il est mort) de l’animal.
     */
    public String toString() {

        if (vivant == true) {

            return nom+" ("+espece.getNom()+") : Vivant et age de "+age+" an(s)";

        }

        else {

            return nom+" ("+espece.getNom()+") : Mort a l'age de "+age+" an(s)";

        }

    }


    //fait vieillir l’animal d’un an s’il est vivant.
    public void vieillir() {

        if (vivant == true) {

            this.age += 1;

        }

    }
    //fait mourir l’animal s’il était vivant.
    public void mourir() {

        if (vivant == true) {

            vivant = false;

        }

    }

}
