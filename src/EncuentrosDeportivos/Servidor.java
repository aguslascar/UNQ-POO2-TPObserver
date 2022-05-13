package EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements ISubject {
	
	Aplicacion app;
	List<String> intereses = new ArrayList<String>();
	List<IListener> suscriptores = new ArrayList<IListener>();
	List<Partido> partidos = new ArrayList<Partido>();
	
	public Servidor(Aplicacion app, String interes) {
		this.app = app;
		intereses.add(interes);
	}
	
	public void agregar(Partido partido) {
		partidos.add(partido);
		this.notificar(partido);
	}

	
	@Override
	public void agregar(IListener listener) {
		suscriptores.add(listener);

	}

	@Override
	public void remover(IListener listener) {
		suscriptores.remove(listener);

	}

	@Override
	public void notificar(Partido partido) {
		for(IListener usuario : suscriptores ) {
			usuario.update(partido);
		}

	}


	@Override
	public List<String> intereses() {
		return intereses;
	}

}
