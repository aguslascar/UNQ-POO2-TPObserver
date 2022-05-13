package Publicaciones;

import java.util.List;

public interface IListener {
	
	public List<String> temasDeInteres();
	public void update(Articulo articulo);
}
