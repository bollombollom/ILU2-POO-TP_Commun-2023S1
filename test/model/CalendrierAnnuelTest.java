package model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalendrierAnnuelTest {
	static CalendrierAnnuel calendrier;

	@BeforeAll
	static void setUpBeforeClass() {
		calendrier = new CalendrierAnnuel();
	}

	@Test
	void testCalendrierAnnuel() throws InterruptedException {
		assertNotNull(calendrier, "calendrier null");
		Thread.sleep(1000);

	}

	@Test
	void testEstLibre() throws InterruptedException {
		assertTrue(calendrier.estLibre(31, 12), "31/12 devrait être libre");
		Thread.sleep(1000);

	}

	@Test
	void testReserver() throws InterruptedException {
		assertTrue(calendrier.reserver(20, 10), "reservation du 20/10 devrait être possible");
		assertFalse(calendrier.estLibre(20, 10), "20/10 devrait être occuper");
		assertFalse(calendrier.reserver(20, 10), "reservation du 20/10 ne devrait pas être possible");
		Thread.sleep(1000);

	}

}
