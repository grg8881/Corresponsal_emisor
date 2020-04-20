package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.FormaPagoEstaticaDAO;
import co.edu.campusucc.sd.modelo.FormaPagoEstatica;

class FormaPagoEstaticaTest {

	@Test
	void test() {
		FormaPagoEstaticaDAO dao = new FormaPagoEstaticaDAO();
		FormaPagoEstatica o = new FormaPagoEstatica();
		
		o.setIdFormaDePago("IdFormaDePago");
		o.setIdFormaDePago("Efectivo");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		FormaPagoEstaticaDAO dao = new FormaPagoEstaticaDAO();
		FormaPagoEstatica o = new FormaPagoEstatica();
		
		o.setIdFormaDePago("IdFormaDePago");
		o.setIdFormaDePago("Efectivo");
		
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
