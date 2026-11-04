package main.java.model;

import java.util.ArrayList;

public class Medaille {
    private int id;
    private String nom;
    private int nbPoints;
    private ArrayList<Participation> lesParticipations = new ArrayList<>();
    private ArrayList<Pays> lesPays = new ArrayList<>();

    public Medaille() {
    }

    public Medaille(int id, String nom, int nbPoints, ArrayList<Participation> lesParticipations, ArrayList<Pays> lesPays) {
        this.id = id;
        this.nom = nom;
        this.nbPoints = nbPoints;
        this.lesParticipations = lesParticipations;
        this.lesPays = lesPays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public ArrayList<Participation> getLesParticipations() {
        return lesParticipations;
    }

    public void setLesParticipations(ArrayList<Participation> lesParticipations) {
        this.lesParticipations = lesParticipations;
    }

    public ArrayList<Pays> getLesPays() {
        return lesPays;
    }

    public void setLesPays(ArrayList<Pays> lesPays) {
        this.lesPays = lesPays;
    }

    public void addParticipation(Participation p){
        lesParticipations.add(p);
    }

    public void addPays(Pays p){
        lesPays.add(p);
    }

}
