package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.ClienteDAO;
import co.edu.campusucc.sd.modelo.Cliente;

class ClienteTest {

	@Test
	void test() {
		ClienteDAO dao = new ClienteDAO();
		Cliente o = new Cliente();
		
		o.setApellidoMaterno("Apellido Materno");
		o.setApellidoPaterno("Appelido Paterno");
		o.setIdCliente("idC");
		o.setIdGiro("G01");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		ClienteDAO dao = new ClienteDAO();
		Cliente o = new Cliente();
		
		o.setApellidoMaterno("Apellido Materno");
		o.setApellidoPaterno("Appelido Paterno");
		o.setIdCliente("idC");
		o.setIdGiro("G01");
		
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


