package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.NegociacionFletesDAO;
import co.edu.campusucc.sd.modelo.NegociacionFletes;

public class NegociacionFletePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegociacionFletesDAO dao = new NegociacionFletesDAO();
		NegociacionFletes o = new NegociacionFletes();
		
		o.setIdNegociacion("idN");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		o.setIdNegociacion("idN");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}

}
