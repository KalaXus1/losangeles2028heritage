package main.java.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaysTest {

    @Test
    void testGetters() {
        Pays pays = new Pays(1, "France");

        assertEquals(1, pays.getId());
        assertEquals("France", pays.getNom());
    }

    @Test
    void testAddMedaille() {
        Pays pays = new Pays(1, "France");
        pays.addMedaille(new Medaille(1, "or", 3));

        assertEquals(1, pays.getLesMedailles().size());
    }

    @Test
    void testGetNbAthlete(){
        Pays pays = new Pays(1, "France");
        pays.addAthlete(new Athlete(1, "Leon Marchand"));
        pays.addAthlete(new Athlete(2, "Tony Parker"));

        assertEquals(2, pays.getNbAthlete());

    }

    @Test
    void testGetNbPoints(){
        Pays pays = new Pays(1, "France");
        pays.addMedaille(new Medaille(1, "or", 3));
        pays.addMedaille(new Medaille(2, "or", 3));
        pays.addMedaille(new Medaille(3, "or", 3));

        assertEquals(9, pays.getNbPoints());

    }

    @Test
    void testGetNbOr(){
        Pays pays = new Pays(1, "France");
        pays.addMedaille(new Medaille(1, "or", 3));
        pays.addMedaille(new Medaille(2, "or", 3));
        pays.addMedaille(new Medaille(3, "or", 3));
        pays.addMedaille(new Medaille(4, "argent", 2));
        pays.addMedaille(new Medaille(5, "bronze", 1));

        assertEquals(3, pays.getNbOr());
    }
}