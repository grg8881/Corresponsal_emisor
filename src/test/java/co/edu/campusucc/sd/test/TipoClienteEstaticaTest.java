package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.TipoClienteEstaticaDAO;
import co.edu.campusucc.sd.modelo.TipoClienteEstatica;

class TipoClienteEstaticaTest {

	@Test
	void test() {
		TipoClienteEstaticaDAO dao = new TipoClienteEstaticaDAO();
		TipoClienteEstatica o = new TipoClienteEstatica();
		
		o.setIdTipoCliente("id");
		o.setNombre("nombre");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		TipoClienteEstaticaDAO dao = new TipoClienteEstaticaDAO();
		TipoClienteEstatica o = new TipoClienteEstatica();
		
		o.setIdTipoCliente("id");
		o.setNombre("nombre");
		
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


