package Publicaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Revista implements ISubject {

	private List<Articulo> articulos = new ArrayList<Articulo>();
	private List<IListener> suscriptores = new ArrayList<IListener>();
	
	
	public void agregar(Articulo articulo) {
		articulos.add(articulo);
		this.notificar(articulo);
		
	}
	 
	@Override
	public void notificar(Articulo articulo) {
		/**
		 * Notifica a cada miembro cuando se agrega un articulo de su interes.
		 */
		for(IListener s : suscriptores) {
			if(this.esDeSuInteres(s, articulo)) {
				s.update(articulo);
			}
		}

	}

	private boolean esDeSuInteres(IListener s, Articulo articulo) {
		/**
		 * Chequeo que el articulo tenga por lo menos un tema de interes del suscriptor.
		 */
		//Intersecto la lista de interes del suscriptor con la lista de temas del articulo.
		//Y chequeo que al menos haya un tema en comun
		return s.temasDeInteres().stream()
				.filter(articulo.temas()::contains)
				.collect(Collectors.toList())
				.size() > 1;
	}

	@Override
	public void suscribir(IListener listener) {
		/**
		 * Agrega un miembro, el cual es suscripto segun su tema de investigacion.
		 */
		suscriptores.add(listener);

	}
	
	@Override
	public void suscribir(IListener listener, String temaDeInteres) {
		/**
		 * Suscribe al miembro a un tema de su interes.
		 */
		//Actualizo el miembro con su nuevo tema de interes.
		
	}

	@Override
	public void desuscribir(IListener listener) {
		suscriptores.remove(listener);

	}

	

}
