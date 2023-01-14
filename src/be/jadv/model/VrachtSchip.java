package be.jadv.model;

public class VrachtSchip extends Schip implements Loodsbaar {
    private int laadVermogen;

    public int getLaadVermogen() {
        return laadVermogen;
    }

    public void setLaadVermogen(int laadVermogen) {
        this.laadVermogen = laadVermogen;
    }

    public VrachtSchip(String naam, double lengte, int laadVermogen) {
        super(naam, lengte);
        this.laadVermogen = laadVermogen;
    }

    public VrachtSchip() {
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + " " + super.getID() + "{" + super.getNaam() + ", " + super.getLengte() + ", " +
                "laadVermogen=" + this.laadVermogen +
                '}';
    }

    @Override
    public void loods() {
        System.out.println("Vrachtschip " + getNaam() + " loodsen..");
    }
}
