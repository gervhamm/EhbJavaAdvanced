package be.jadv.exception;

public class SchipNietGevondenException extends Exception{

    public SchipNietGevondenException(String schipNaam){
        super("Afmeren mislukt: Schip " + schipNaam + " ligt niet in de haven");
    }
}
