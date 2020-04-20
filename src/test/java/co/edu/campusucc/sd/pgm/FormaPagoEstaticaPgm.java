package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.FormaPagoEstaticaDAO;
import co.edu.campusucc.sd.modelo.FormaPagoEstatica;

public class FormaPagoEstaticaPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		o.setIdFormaDePago("IdFormaDePago");
		o.setIdFormaDePago("Efectivo");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}

}
