package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.NegociacionFletesDAO;
import co.edu.campusucc.sd.modelo.NegociacionFletes;

class NegociacionFletesTest {

	@Test
	void test() {
		NegociacionFletesDAO dao = new NegociacionFletesDAO();
		NegociacionFletes o = new NegociacionFletes();
		
		o.setIdNegociacion("idN");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		NegociacionFletesDAO dao = new NegociacionFletesDAO();
		NegociacionFletes o = new NegociacionFletes();
		
		o.setIdNegociacion("idN");
		
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

