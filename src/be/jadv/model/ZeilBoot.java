package be.jadv.model;

public class ZeilBoot extends Schip{
    private int aantalMasten;

    public int getAantalMasten() {
        return aantalMasten;
    }

    public void setAantalMasten(int aantalMasten) {
        this.aantalMasten = aantalMasten;
    }

    public ZeilBoot(String naam, double lengte, int aantalMasten) {
        super(naam, lengte);
        this.aantalMasten = aantalMasten;
    }

    public ZeilBoot() {
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + " " + super.getID() + "{" + super.getNaam() + ", " + super.getLengte() + ", " +
                "aantalMasten=" + aantalMasten +
                '}';
    }
}
