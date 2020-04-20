package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.ClienteDAO;
import co.edu.campusucc.sd.modelo.Cliente;

public class ClientePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
