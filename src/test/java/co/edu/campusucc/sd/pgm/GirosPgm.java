package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.GirosDAO;
import co.edu.campusucc.sd.modelo.Giros;

public class GirosPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirosDAO dao = new GirosDAO();
		Giros o = new Giros();
		
		o.setIdAdministrador("IdA");
		o.setIdGiros("IdG");
		o.setIdVerificarMontoPermitido("VerificarM");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		o.setIdAdministrador("IdA");
		o.setIdGiros("IdG");
		o.setIdVerificarMontoPermitido("VerificarM");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}

}
