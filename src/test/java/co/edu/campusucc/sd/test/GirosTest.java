package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.GirosDAO;
import co.edu.campusucc.sd.modelo.Giros;

class GirosTest {

	@Test
	void test() {
		GirosDAO dao = new GirosDAO();
		Giros o = new Giros();
		
		o.setIdAdministrador("IdA");
		o.setIdGiros("IdG");
		o.setIdVerificarMontoPermitido("VerificarM");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		GirosDAO dao = new GirosDAO();
		Giros o = new Giros();
		
		o.setIdAdministrador("IdA");
		o.setIdGiros("IdG");
		o.setIdVerificarMontoPermitido("VerificarM");
		
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
