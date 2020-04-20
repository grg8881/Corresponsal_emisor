package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.BiometriaDAO;
import co.edu.campusucc.sd.modelo.Biometria;

class BiometriaTest {

	@Test
	final void testPersist() {
		BiometriaDAO dao = new BiometriaDAO();
		Biometria o = new Biometria();
		
		o.setCliente(null);
		o.setHuella01(null);
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		BiometriaDAO dao = new BiometriaDAO();
		Biometria o = new Biometria();
		
		o.setCliente(null);
		o.setHuella01(null);
		
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
