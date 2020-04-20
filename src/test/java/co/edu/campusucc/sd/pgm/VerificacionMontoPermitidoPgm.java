package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.VerificacionMontoPermitidoDAO;
import co.edu.campusucc.sd.modelo.VerificacionMontoPermitido;

public class VerificacionMontoPermitidoPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		o.setIdCliente("id");
		o.setIdGiro("Gi");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
		
	}

}
