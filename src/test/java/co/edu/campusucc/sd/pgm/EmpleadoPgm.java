package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.EmpleadoDAO;
import co.edu.campusucc.sd.modelo.Empleado;

public class EmpleadoPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
