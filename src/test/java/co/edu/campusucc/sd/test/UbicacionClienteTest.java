package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.UbicacionClienteDAO;
import co.edu.campusucc.sd.modelo.UbicacionCliente;

class UbicacionClienteTest {

	@Test
	void test() {
		UbicacionClienteDAO dao = new UbicacionClienteDAO();
		UbicacionCliente o = new UbicacionCliente();
		
		o.setDireccionActual("Dir");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		UbicacionClienteDAO dao = new UbicacionClienteDAO();
		UbicacionCliente o = new UbicacionCliente();
		
		o.setDireccionActual("Dir");
		
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


