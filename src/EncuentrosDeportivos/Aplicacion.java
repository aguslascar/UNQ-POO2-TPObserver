package EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacion {
	private List<IListener> usuarios = new ArrayList<IListener>();
	private List<ISubject> servidores = new ArrayList<ISubject>();
	
	
	public void registrarPartido(Partido partido) {
		if(!(servidores.stream().anyMatch(s -> s.intereses().contains(partido.deporte())))) {
			this.agregarNuevoServidor(partido.deporte());
		}
		for(ISubject s : servidores) {
			if(s.intereses().contains(partido.deporte())) {
				s.agregar(partido);
			}
		}
	}
	
	public void agregarSuscripcion(Usuario usuario, String interes) {
		if(!(servidores.stream().anyMatch(s -> s.intereses().contains(interes)))) {
			this.agregarNuevoServidor(interes);
		}
		for(ISubject s:servidores) {
			if(s.intereses().contains(interes)) {
				s.agregar(usuario);
			}
		}	
		usuarios.add(usuario);
	}

	
	private void agregarNuevoServidor(String interes) {
		ISubject servidor = new Servidor(this, interes);
		servidores.add(servidor);
		
	}

	public List<ISubject> servidores() {
		return servidores;
	}
}
