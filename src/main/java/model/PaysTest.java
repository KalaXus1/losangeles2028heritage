package main.java.model;

import org.junit.jupiter.api.BeforeEach;

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
}