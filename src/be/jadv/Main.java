package be.jadv;

import be.jadv.exception.SchipNietGevondenException;
import be.jadv.model.Haven;
import be.jadv.model.VrachtSchip;
import be.jadv.model.ZeilBoot;

public class Main {
    public static void main(String[] args) {

        VrachtSchip v1 = new VrachtSchip("GroteFrans", 100.0, 2500);
        VrachtSchip v2 = new VrachtSchip("SuperMaramiu", 400.0, 7500);
        ZeilBoot z1 = new ZeilBoot("SmalleSally", 15.0,1);

        Haven h1 = new Haven("Wally-Kiwi", 150.0);

        h1.aanMeren(v1);
        h1.aanMeren(z1);
        h1.aanMeren(v2);
        try{
            h1.afmeren("GroteFrans");
            h1.afmeren("SuperMaramiu");
            h1.afmeren("SmalleSally");
        }catch (SchipNietGevondenException e){
            System.out.println(e.getMessage());
        }
    }
}