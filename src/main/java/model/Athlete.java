package main.java.model;

import java.util.ArrayList;

public class Athlete {
    private int id;
    private String nom;
    private Pays pays;
    private ArrayList<Participation> lesParticipations = new ArrayList<>();

    public Athlete() {
    }

    public Athlete(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Athlete(int id, String nom, Pays pays, ArrayList<Participation> lesParticipations) {
        this.id = id;
        this.nom = nom;
        this.pays = pays;
        this.lesParticipations = lesParticipations;
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

    public ArrayList<Participation> getLesParticipations() {
        return lesParticipations;
    }

    public void setLesParticipations(ArrayList<Participation> lesParticipations) {
        this.lesParticipations = lesParticipations;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public void addParticiaption(Participation p){
        lesParticipations.add(p);
    }
}
