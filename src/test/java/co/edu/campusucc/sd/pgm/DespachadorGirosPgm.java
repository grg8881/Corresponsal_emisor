package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.DespachadorGirosDAO;
import co.edu.campusucc.sd.modelo.DespachadorGiros;

public class DespachadorGirosPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DespachadorGirosDAO dao = new DespachadorGirosDAO();
		DespachadorGiros o = new DespachadorGiros();
		
		o.setComisionGiro("Com");
		o.setIdCoopetran("iC1");
		o.setIdDespachador(1234567L);
		
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
		o.setComisionGiro("Com");
		o.setIdCoopetran("iC1");
		o.setIdDespachador(1234567L);
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}

}
