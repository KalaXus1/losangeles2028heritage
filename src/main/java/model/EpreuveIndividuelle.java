package main.java.model;

import java.util.ArrayList;

public class EpreuveIndividuelle extends Epreuve {
    private double recordOlympique;
    private String unite;
    private ArrayList<Participation> lesParticipations = new ArrayList<>();

    public EpreuveIndividuelle() {
    }

    public EpreuveIndividuelle(double recordOlympique, String unite, ArrayList<Participation> lesParticipations) {
        this.recordOlympique = recordOlympique;
        this.unite = unite;
        this.lesParticipations = lesParticipations;
    }

    public double getRecordOlympique() {
        return recordOlympique;
    }

    public void setRecordOlympique(double recordOlympique) {
        this.recordOlympique = recordOlympique;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public ArrayList<Participation> getLesParticipations() {
        return lesParticipations;
    }

    public void setLesParticipations(ArrayList<Participation> lesParticipations) {
        this.lesParticipations = lesParticipations;
    }
}
