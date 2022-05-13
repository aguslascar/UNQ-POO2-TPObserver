package Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
	private String titulo;
	private String autor;
	private String filiacion;
	private String tipo;
	private String lugar;
	private String keywords;
	
	public Articulo(String titulo, String autor, String filiacion, String tipo, String lugar, String keywords) {
		this.titulo = titulo;
		this.autor = autor;
		this.filiacion = filiacion;
		this.tipo = tipo;
		this.lugar = lugar;
		this.keywords = keywords;
	}

	public List<String> temas() {
		List<String> temas = new ArrayList<String>();
		temas.add(autor);
		temas.add(filiacion);
		temas.add(keywords); 
		temas.add(lugar);
		temas.add(tipo);
		temas.add(titulo);
		return temas;
	}
}
