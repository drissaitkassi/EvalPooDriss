public class Vetement extends Produit {

    private int taille;
    public Vetement(String nom, double prix, int nombreExemplaire,int taille) throws IllegalAccessException {
        super(nom, prix, nombreExemplaire);
        setTaille(taille);
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) throws  IllegalAccessException{
        if ( taille<34 || taille>54)throw new IllegalAccessException("taille erroné");
        this.taille = taille;
    }

    @Override
    public void remise() {
        try {
            setPrix(getPrix()-getPrix()*REMISE_VETEMENT);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String  toString(){
       return "Vetement "+super.toString()+ " taille: " +this.taille;

    }



}
