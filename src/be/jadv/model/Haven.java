package be.jadv.model;

import be.jadv.exception.SchipNietGevondenException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Haven {
    private String naam;
    private double maximumLengte = 150.0;

    private double volzetLengte;

    private HashSet<Schip> schepen = new HashSet<>();

    public Haven(String naam, double maximumLengte) {
        this.naam = naam;
        this.maximumLengte = maximumLengte;
    }

    public boolean aanMeren(Schip schip){
        System.out.println("Aanmeren van " + schip.toString());

        if(schip.getLengte() + this.volzetLengte <= this.maximumLengte){
            if(schip instanceof VrachtSchip){
                ((VrachtSchip) schip).loods();
            }
            this.volzetLengte += schip.getLengte();
            schepen.add(schip);
            return true;
        }else{
            System.out.println("Sorry er is geen plaats meer voor dit schip");
            return false;
        }
    }
    public void afmeren(String schipNaam) throws SchipNietGevondenException {
        boolean schipGevonden = false   ;
        for (Schip schip: this.schepen){
            if (schip.getNaam().equals(schipNaam)){
                schipGevonden = true;
            }
        }

        if (!schipGevonden){
            throw new SchipNietGevondenException(schipNaam);
        }
    }

    public List<Schip> geefSchepenGesorteerdOpNaam(){
        List<Schip> gesorteerdeSchepen = new ArrayList<>(this.schepen);
        Collections.sort(gesorteerdeSchepen);
        return gesorteerdeSchepen;
    }

    public List<Schip> geefSchepenGesorteerdOpLengte(){
        List<Schip> gesorteerdeSchepen = new ArrayList<>(this.schepen);
        Collections.sort(gesorteerdeSchepen,new LengteSorteerder());
        return gesorteerdeSchepen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getMaximumLengte() {
        return maximumLengte;
    }

    public void setMaximumLengte(double maximumLengte) {
        this.maximumLengte = maximumLengte;
    }

    public HashSet<Schip> getSchepen() {
        return schepen;
    }

    public void setSchepen(HashSet<Schip> schepen) {
        this.schepen = schepen;
    }

    public double getVolzetLengte() {
        return volzetLengte;
    }

    public void setVolzetLengte(double volzetLengte) {
        this.volzetLengte = volzetLengte;
    }

}
