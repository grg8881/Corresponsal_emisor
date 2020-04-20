package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.DespachadorGirosDAO;
import co.edu.campusucc.sd.modelo.DespachadorGiros;

class DespachadorGirosTest {

	@Test
	void test() {
		DespachadorGirosDAO dao = new DespachadorGirosDAO();
		DespachadorGiros o = new DespachadorGiros();
		
		o.setComisionGiro("Com");
		o.setIdCoopetran("iC1");
		o.setIdDespachador(1234567L);
		
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		DespachadorGirosDAO dao = new DespachadorGirosDAO();
		DespachadorGiros o = new DespachadorGiros();
		
		o.setComisionGiro("Com");
		o.setIdCoopetran("iC1");
		o.setIdDespachador(1234567L);
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}
/*
	@Test
	final void testMerge() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testFindById() {
		fail("Not yet implemented"); // TODO
	}
*/
}


