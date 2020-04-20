package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.BiometriaDAO;
import co.edu.campusucc.sd.modelo.Biometria;

public class BiometriaPgm {

	public static void main(String[] args) {
		BiometriaDAO dao = new BiometriaDAO();
		Biometria o = new Biometria();
		
		o.setCliente(null);
		o.setHuella01(null);
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
		o.setCliente(null);
		o.setHuella01(null);
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	
	
	}

}
