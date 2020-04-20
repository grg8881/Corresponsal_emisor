package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelo.Pais;

class PaisTest {

	@Test
	void test() {
		PaisDAO dao = new PaisDAO();
		Pais o = new Pais();
		
		o.setIdPais("12");
		o.setGentilicioNal("Colombiano");
		o.setIdNacionalidad("COL");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		PaisDAO dao = new PaisDAO();
		Pais o = new Pais();
		
		o.setGentilicioNal("Colombiano");
		o.setIdNacionalidad("COL");
		
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

