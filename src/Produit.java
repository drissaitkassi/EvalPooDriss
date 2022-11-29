import java.util.Collection;
import java.util.Collections;

public  abstract class Produit implements Sold ,Comparable<Produit>{


    static int numero=0;

    static double chiffreAffaire=0;
    private String nom;
    private double prix;
    private int nombreExemplaire;

    public Produit(String nom,double prix,int nombreExemplaire) throws IllegalAccessException {

        this.nom=nom;
        setPrix(prix);
        setNombreExemplaire(nombreExemplaire);
        //todo modify
        numero++;

    }
    @Override
    public  void remise(){

    };

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix)throws IllegalAccessException {
        if (prix < 0)throw new IllegalAccessException("merci de saisir un nembre positive ");
   else this.prix=prix;   }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire)throws IllegalAccessException {
        if (nombreExemplaire<0)throw new IllegalAccessException("le nombre d'exemplaire ne peut pas etre negative");
        this.nombreExemplaire = nombreExemplaire;
    }

    @Override
    public String  toString(){
        return this.nom.toUpperCase()+" prix: "+this.prix+ " nombre exemplaire: "+this.nombreExemplaire;
    }

    public void  vendre(int quantite) throws IllegalAccessException{

        //todo la quantité de vente ne doit pas depaaser le stock dispnible

        if (quantite>this.nombreExemplaire)throw new IllegalAccessException(" Quantite indisponible");
        chiffreAffaire+=this.prix*quantite;
        this.nombreExemplaire=nombreExemplaire-quantite;
    }

    @Override
    public int compareTo(Produit o) {
        return Double.compare(this.prix,o.prix);

    }
}
