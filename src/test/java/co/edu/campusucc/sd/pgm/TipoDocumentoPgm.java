package co.edu.campusucc.sd.pgm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import co.edu.campusucc.sd.daos.TipoDocumentoDAO;
import co.edu.campusucc.sd.modelo.TipoDocumento;

public class TipoDocumentoPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipoDocumentoDAO dao = new TipoDocumentoDAO();
		TipoDocumento o = new TipoDocumento();
		
		o.setIdTipoDocumento("TipoD");
		o.setNombreDocumento("Cédula");
		
		try {
			dao.persist(o);
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
		o.setIdTipoDocumento("TipoD");
		o.setNombreDocumento("Cédula");
		
		try {
			dao.delete(o);;
			assertTrue(true);
			
		} catch (Exception e) {
			fail("Not yet implemented"); 
		}
	}

}
