package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.TipoClienteEstaticaDAO;
import co.edu.campusucc.sd.modelo.TipoClienteEstatica;

public class TipoClienteEstaticaPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipoClienteEstaticaDAO dao = new TipoClienteEstaticaDAO();
		TipoClienteEstatica o = new TipoClienteEstatica();
		
		o.setIdTipoCliente("id");
		o.setNombre("nombre");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		o.setIdTipoCliente("id");
		o.setNombre("nombre");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}

}
