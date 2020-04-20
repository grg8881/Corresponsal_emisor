package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.UbicacionClienteDAO;
import co.edu.campusucc.sd.modelo.UbicacionCliente;

public class UbicacionClientePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UbicacionClienteDAO dao = new UbicacionClienteDAO();
		UbicacionCliente o = new UbicacionCliente();
		
		o.setDireccionActual("Dir");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
o.setDireccionActual("Dir");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

}
