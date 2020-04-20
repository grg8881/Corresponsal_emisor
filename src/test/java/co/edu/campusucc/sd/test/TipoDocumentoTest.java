package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.TipoDocumentoDAO;
import co.edu.campusucc.sd.modelo.TipoDocumento;

class TipoDocumentoTest {

	@Test
	void test() {
		TipoDocumentoDAO dao = new TipoDocumentoDAO();
		TipoDocumento o = new TipoDocumento();
		
		o.setIdTipoDocumento("TipoD");
		o.setNombreDocumento("Cédula");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		TipoDocumentoDAO dao = new TipoDocumentoDAO();
		TipoDocumento o = new TipoDocumento();
		
		o.setIdTipoDocumento("TipoD");
		o.setNombreDocumento("Cédula");
		
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


