package main.java.model;

import java.util.ArrayList;

public class Pays {
    private int id;
    private String nom;
    private ArrayList<Athlete> lesAthletes = new ArrayList<>();
    private ArrayList<EpreuveCollective> lesEpreuvesCollectives = new ArrayList<>();
    private ArrayList<Medaille> lesMedailles = new ArrayList<>();

    public Pays() {
    }

    public Pays(int id, String nom, ArrayList<Athlete> lesAthletes, ArrayList<EpreuveCollective> lesEpreuvesCollectives, ArrayList<Medaille> lesMedailles) {
        this.id = id;
        this.nom = nom;
        this.lesAthletes = lesAthletes;
        this.lesEpreuvesCollectives = lesEpreuvesCollectives;
        this.lesMedailles = lesMedailles;
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

    public ArrayList<Athlete> getLesAthletes() {
        return lesAthletes;
    }

    public void setLesAthletes(ArrayList<Athlete> lesAthletes) {
        this.lesAthletes = lesAthletes;
    }

    public ArrayList<EpreuveCollective> getLesEpreuvesCollectives() {
        return lesEpreuvesCollectives;
    }

    public void setLesEpreuvesCollectives(ArrayList<EpreuveCollective> lesEpreuvesCollectives) {
        this.lesEpreuvesCollectives = lesEpreuvesCollectives;
    }

    public ArrayList<Medaille> getLesMedailles() {
        return lesMedailles;
    }

    public void setLesMedailles(ArrayList<Medaille> lesMedailles) {
        this.lesMedailles = lesMedailles;
    }

    public void addMedaille(Medaille m){
        lesMedailles.add(m);
    }

    public void addAthlete(Athlete a){
        lesAthletes.add(a);
    }

    public void addEpreuvesCollectives(Epreuve e){
        lesEpreuvesCollectives.add(e);
    }
}
