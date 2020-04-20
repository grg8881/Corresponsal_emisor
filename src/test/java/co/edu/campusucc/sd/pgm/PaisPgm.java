package co.edu.campusucc.sd.pgm;

import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelo.Pais;

class PaisPgm {

	public static void main(String[] args) {
		
		PaisDAO dao = new PaisDAO();
		Pais o = new Pais();
		
		o.setIdPais("12");
		o.setGentilicioNal("Colombiano");
		o.setIdNacionalidad("COL");
		
		try {
			dao.persist(o);
			System.out.println("true");
			
		} catch (Exception e) {
			System.out.println("Not yet implemented"); 
		}
		
	}

	/*testDelete() {
		PaisDAO dao = new PaisDAO();
		Pais o = new Pais();
		
		o.setGentilicioNal("Colombiano");
		o.setIdNacionalidad("COL");
		
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

