package Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Miembro implements IListener {
	
	private List<String> temasDeInteres = new ArrayList<String>();
	
	public Miembro(String temaDeInvestigacion) {
		/**
		 * Creo un nuevo miembro y agrego a sus intereses, su tema de investigacion.
		 */
		temasDeInteres.add(temaDeInvestigacion);
	}
	
	public void agregarInteres(String temaDeInteres) {
		temasDeInteres.add(temaDeInteres);
	}
	
	public void agregarArticulo(Revista revista, Articulo articulo) {
		revista.agregar(articulo);
	}
	
	public List<String> temasDeInteres() {
		return temasDeInteres;
	}
	
	@Override
	public void update(Articulo articulo) {
		// TODO Auto-generated method stub

	}

}
