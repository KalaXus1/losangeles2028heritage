package main.java.model;

import java.util.ArrayList;

public class EpreuveCollective extends Epreuve {
    private int dureeMin;
    private int nbTours;
    private ArrayList<Pays> lesPays = new ArrayList<>();

    public EpreuveCollective() {
    }

    public EpreuveCollective(int id, String nom, Sport sport, int dureeMin, int nbTours, ArrayList<Pays> lesPays) {
        super(id, nom, sport);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
        this.lesPays = lesPays;
    }

    public int getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(int dureeMin) {
        this.dureeMin = dureeMin;
    }

    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

    public ArrayList<Pays> getLesPays() {
        return lesPays;
    }

    public void setLesPays(ArrayList<Pays> lesPays) {
        this.lesPays = lesPays;
    }
    public void addPays(Pays p){
        lesPays.add(p);
    }
}
