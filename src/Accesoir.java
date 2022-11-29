public class Accesoir extends  Produit{
    public Accesoir(String nom, double prix, int nombreExemplaire) throws IllegalAccessException {
        super(nom, prix, nombreExemplaire);
    }

    @Override
    public String  toString(){
        return "Accessoir "+super.toString();

    }
    public void remise() {
        try {
            setPrix(getPrix()-getPrix()*REMISE_ACCESSOIRE);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
