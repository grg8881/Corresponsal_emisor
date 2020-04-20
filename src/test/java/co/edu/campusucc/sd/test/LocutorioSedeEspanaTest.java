package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.LocutorioSedeEspanaDAO;
import co.edu.campusucc.sd.modelo.LocutorioSedeEspana;

class LocutorioSedeEspanaTest {

	@Test
	void test() {
		LocutorioSedeEspanaDAO dao = new LocutorioSedeEspanaDAO();
		LocutorioSedeEspana o = new LocutorioSedeEspana();
		
		o.setEmailLocutorio("email@locutorio");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		
	}

	@Test
	final void testDelete() {
		LocutorioSedeEspanaDAO dao = new LocutorioSedeEspanaDAO();
		LocutorioSedeEspana o = new LocutorioSedeEspana();
		
		o.setEmailLocutorio("email@locutorio");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}
/*
	@Test
	final void testMerge() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testFindById() {
		fail("Not yet implemented"); // TODO
	}
*/
}
