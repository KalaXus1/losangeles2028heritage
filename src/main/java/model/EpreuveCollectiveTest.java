package main.java.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpreuveCollectiveTest {

    @Test
    void testGetters() {
        Sport sport = new Sport(1, "Basketball");
        EpreuveCollective basket = new EpreuveCollective(1, "Tournoi masculin", sport, 40, 4);

        assertEquals("Tournoi masculin", basket.getNom());
        assertEquals(40, basket.getDureeMin());
        assertEquals(4, basket.getNbTours());
    }

    @Test
    void testAddPays() {
        EpreuveCollective basket = new EpreuveCollective();
        basket.addPays(new Pays(1, "France"));

        assertEquals(1, basket.getLesPays().size());
    }

    @Test
    void testGetNbPays(){
        EpreuveCollective basket = new EpreuveCollective();
        basket.addPays(new Pays(1, "France"));
        basket.addPays(new Pays(2, "Espagne"));
        basket.addPays(new Pays(3, "Angleterre"));
        assertEquals(3, basket.getNbPays());
    }
}