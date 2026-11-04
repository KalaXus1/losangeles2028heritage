package main.java.model;

public class Participation {
    private int place;
    private double temps;
    private boolean recordOlympique;
    private Athlete athlete;
    private EpreuveIndividuelle epreuveIndividuelle;
    private Medaille medaille;

    public Participation() {
    }

    public Participation(int place, double temps, boolean recordOlympique, Athlete athlete, EpreuveIndividuelle epreuveIndividuelle, Medaille medaille) {
        this.place = place;
        this.temps = temps;
        this.recordOlympique = recordOlympique;
        this.athlete = athlete;
        this.epreuveIndividuelle = epreuveIndividuelle;
        this.medaille = medaille;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public double getTemps() {
        return temps;
    }

    public void setTemps(double temps) {
        this.temps = temps;
    }

    public boolean isRecordOlympique() {
        return recordOlympique;
    }

    public void setRecordOlympique(boolean recordOlympique) {
        this.recordOlympique = recordOlympique;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public EpreuveIndividuelle getEpreuveIndividuelle() {
        return epreuveIndividuelle;
    }

    public void setEpreuveIndividuelle(EpreuveIndividuelle epreuveIndividuelle) {
        this.epreuveIndividuelle = epreuveIndividuelle;
    }

    public Medaille getMedaille() {
        return medaille;
    }

    public void setMedaille(Medaille medaille) {
        this.medaille = medaille;
    }
}
