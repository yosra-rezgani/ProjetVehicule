import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestZoo {

   /** crée 3 espèces d’animaux (lion,oiseau,ane)
    * les affiche à l’écran (en utilisant les getteurs de la classe Espece)
    */
   @Test
   public void Test1() {


       Espece lion = new Espece("Lion", "roar");

       Espece oiseau = new Espece("Oiseau", "cui-cui");

       Espece ane = new Espece("Ane", "hi-han");


       String t1 = "Le cri du " + lion.getNom() + " est: " + lion.getCri();
       String t2 = "Le cri du " + oiseau.getNom() + " est: " + oiseau.getCri();
       String t3 = "Le cri du " + ane.getNom() + " est: " + ane.getCri();

       System.out.println(t1);
       System.out.println(t2);
       System.out.println(t3);


       Animal simba = new Animal("Simba", lion);

       Animal coco = new Animal("Coco", oiseau);

       Animal titi = new Animal("Titi", oiseau);

       Animal bourriquet = new Animal("Bourriquet", ane);
   }


    /** créer des animaux
     faire vieillir un animal d’un an
     faire vieillir un animal de 4 ans
     faire mourir un animal
     afficher les animaux à l’écran (en utilisant la méthode « toString() »)
     **/
    @Test
       public void Test2 () {

           Espece lion = new Espece("Lion", "roar");

           Espece oiseau = new Espece("Oiseau", "cui-cui");

           Espece ane = new Espece("Ane", "hi-han");


           String text = "Le cri du " + lion.getNom() + " est: " + lion.getCri();

           System.out.println(text);


           Animal simba = new Animal("Simba", lion);

           Animal coco = new Animal("Coco", oiseau);

           Animal titi = new Animal("Titi", oiseau);

           Animal bourriquet = new Animal("Bourriquet", ane);

           simba.vieillir();

           for (int i = 0; i < 4; i++) {

               coco.vieillir();

           }

           bourriquet.mourir();


           System.out.println(simba.toString());

           System.out.println(coco.toString());

           System.out.println(titi.toString());

           System.out.println(bourriquet.toString());
   }

    /** Créer un zoo et faire entrer quelques animaux au zoo
     - nourrir les animaux
     - Afficher les cris de joie des animaux qu’ont poussé les animaux lors du repas
     **/
   @Test
        public void Test3 () {

       Espece lion = new Espece("Lion", "roar");

       Espece oiseau = new Espece("Oiseau", "cui-cui");


       // Créer un zoo avec son directeur , et annimal (simba: lion et Coco: Oiseau)
       Animal simba = new Animal("Simba", lion);

       Animal coco = new Animal("Coco", oiseau);

       Zoo safari = new Zoo("Yosra");

       safari.ajouterAnimal(simba);

       safari.ajouterAnimal(coco);



       // nourrir les animaux de zoo : Afficher les cris de joie des animaux qu’ont poussé les animaux lors du repas
       ArrayList cris = safari.nourrir();

       for (int i = 0; i < cris.size(); i++) {

               System.out.println(cris.get(i));

           }

       }
   }


