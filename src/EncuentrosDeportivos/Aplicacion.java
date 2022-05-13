package EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
	private List<IListener> usuarios = new ArrayList<IListener>();
	private List<ISubject> servidores = new ArrayList<ISubject>();
	
	
	public void registrarPartido(Partido partido) {
		if(!(servidores.stream().anyMatch(s -> s.intereses().contains(partido.deporte())))) {
			this.agregarNuevoServidor(partido);
		}
		else {
		for(ISubject s : servidores) {
			if(s.intereses().contains(partido.deporte())) {
				s.agregar(partido);
			}
		}
	  }
	}
	
	public void agregarSuscripcion(Usuario usuario) {
		usuarios.add(usuario);
	}


	private void agregarNuevoServidor(Partido partido) {
		ISubject servidor = new Servidor(this, partido.deporte());
		servidor.agregar(partido);
		servidores.add(servidor);
		
	}

	public List<ISubject> servidores() {
		return servidores;
	}
}
