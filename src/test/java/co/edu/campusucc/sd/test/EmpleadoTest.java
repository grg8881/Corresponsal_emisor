package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.EmpleadoDAO;
import co.edu.campusucc.sd.modelo.Empleado;

class EmpleadoTest {

	@Test
	void test() {
		EmpleadoDAO dao = new EmpleadoDAO();
		Empleado o = new Empleado();
		
		o.setIdEmpleado("IdE");
		o.setIdGiros("IdG");
		o.setNombre("Nombre Empleado");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		EmpleadoDAO dao = new EmpleadoDAO();
		Empleado o = new Empleado();
		
		o.setIdEmpleado("IdE");
		o.setIdGiros("IdG");
		o.setNombre("Nombre Empleado");
		
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
