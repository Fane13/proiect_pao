package model;

import java.util.ArrayList;
import java.util.List;

public class Rezervare {

    private int nr_rezervare;
    private int loc_rezervat;
//    private Client client;

    public Rezervare(int nr_rezervare, int loc_rezervat) {
        this.nr_rezervare = nr_rezervare;
        this.loc_rezervat = loc_rezervat;

    }

    public int getNr_rezervare() {
        return nr_rezervare;
    }

    public void setNr_rezervare(int nr_rezervare) {
        this.nr_rezervare = nr_rezervare;
    }

    public int getLoc_rezervat() {
        return loc_rezervat;
    }

    public void setLoc_rezervat(int loc_rezervat) {
        this.loc_rezervat = loc_rezervat;
    }


    @Override
    public String toString() {
        return "Rezervare{" +
                "Numar Rezervare=" + nr_rezervare +
                ", Loc rezervat=" + loc_rezervat +
                '}';
    }
}
