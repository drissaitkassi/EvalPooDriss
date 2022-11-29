public class Chaussure extends  Produit {

    private int pointure;

    public Chaussure(String nom, double prix, int nombreExemplaire ,int pointure) throws IllegalAccessException{
        super(nom, prix, nombreExemplaire);

        setPointure(pointure);
    }

    public int getPointure() {
        return pointure;
    }

    public void setPointure(int pointure) throws IllegalAccessException{
        if (pointure>50 || pointure<36 )throw new IllegalAccessException("Pointure erroné ");
        this.pointure = pointure;
    }
    @Override
    public String  toString(){
        return "Chaussure "+super.toString()+ " Pointure: " +this.pointure;

    }
    public void remise() {
        try {
            setPrix(getPrix()-getPrix()*REMISE_CHAUSSURE);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
