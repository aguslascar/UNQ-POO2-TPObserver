package Publicaciones;

public interface ISubject {
	
	public void notificar(Articulo articulo);
	public void suscribir(IListener listener);
	public void desuscribir(IListener listener);
	void suscribir(IListener listener, String temaDeInteres);
}
