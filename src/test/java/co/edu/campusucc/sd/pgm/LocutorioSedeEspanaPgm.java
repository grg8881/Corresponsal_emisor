package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.LocutorioSedeEspanaDAO;
import co.edu.campusucc.sd.modelo.LocutorioSedeEspana;

public class LocutorioSedeEspanaPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocutorioSedeEspanaDAO dao = new LocutorioSedeEspanaDAO();
		LocutorioSedeEspana o = new LocutorioSedeEspana();
		
		o.setEmailLocutorio("email@locutorio");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
o.setEmailLocutorio("email@locutorio");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}

}
