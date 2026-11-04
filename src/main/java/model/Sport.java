package main.java.model;
import java.util.ArrayList;

public class Sport {
    private int id;
    private String nom;
    private ArrayList<Epreuve> lesEpreuves = new ArrayList<>();

    public Sport(){};

    public Sport(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    public ArrayList<Epreuve> getLesEpreuves() {
        return lesEpreuves;
    }

    public void setLesEpreuves(ArrayList<Epreuve> lesEpreuves) {
        this.lesEpreuves = lesEpreuves;
    }

    public void addEpreuve(Epreuve e){
        lesEpreuves.add(e);
    }
}
