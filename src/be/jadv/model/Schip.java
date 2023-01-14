package be.jadv.model;

import java.util.Objects;

public abstract class Schip implements Comparable<Schip>{
    private final int ID;
    private static int aantalSchepen;
    private String naam;
    private double lengte;

    protected int getID() {
        return ID;
    }


    protected static int getAantalSchepen() {
        return aantalSchepen;
    }

    protected static void setAantalSchepen(int aantalSchepen) {
        Schip.aantalSchepen = aantalSchepen;
    }

    protected String getNaam() {
        return naam;
    }

    protected void setNaam(String naam) {
        this.naam = naam;
    }

    protected double getLengte() {
        return lengte;
    }

    protected void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public Schip(String naam, double lengte) {
        this();
        this.naam = naam;
        this.lengte = lengte;
    }

    public Schip() {
        aantalSchepen++;
        this.ID = aantalSchepen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schip schip = (Schip) o;
        return ID == schip.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public int compareTo(Schip o) {
        return this.naam.compareTo(o.getNaam());
    }
}
