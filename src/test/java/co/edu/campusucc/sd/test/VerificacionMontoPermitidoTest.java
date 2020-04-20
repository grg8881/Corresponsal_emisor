package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.VerificacionMontoPermitidoDAO;
import co.edu.campusucc.sd.modelo.VerificacionMontoPermitido;

class VerificacionMontoPermitidoTest {

	@Test
	void test() {
		VerificacionMontoPermitidoDAO dao = new VerificacionMontoPermitidoDAO();
		VerificacionMontoPermitido o = new VerificacionMontoPermitido();
		
		o.setIdCliente("id");
		o.setIdGiro("Gi");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		VerificacionMontoPermitidoDAO dao = new VerificacionMontoPermitidoDAO();
		VerificacionMontoPermitido o = new VerificacionMontoPermitido();
		
		o.setIdCliente("id");
		o.setIdGiro("Gi");
		
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
