import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        //1. Créer quelques produits.

        ArrayList<Produit> produits=new ArrayList<>();


        try {
            Chaussure basket = new Chaussure("addidas 1",500.0,10 ,37);
            produits.add(basket);
            //basket.vendre(9);
            //basket.remise();

        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        try {
           Vetement pentalon = new Vetement("levise",300.0,15,35);
           produits.add(pentalon);
          // pentalon.vendre(12);
           //pentalon.remise();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        try {
           Accesoir lunnette = new Accesoir("rayban",200.0,5);
           produits.add(lunnette);
          // lunnette.vendre(4);
           //lunnette.remise();

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        // 2. Créer un tableau de produits qui contient l'ensemble de tous les
        //produits créés.

        System.out.println(produits);



        System.out.println("chiffre d'affaire  "+Produit.chiffreAffaire);

        for (Produit p:produits) {
            try {
                p.vendre(1);
                p.remise();
                System.out.println(p);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("chiffre d'affaire "+Produit.chiffreAffaire);
        Collections.sort(produits);
        System.out.println(produits);
        System.out.println(Produit.numero);



    }




}
