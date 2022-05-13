package EncuentrosDeportivos;

import java.util.List;

public interface ISubject {
	
	public void agregar(IListener listener);
	public void remover(IListener listener);
	public void agregar(Partido partido);
	public List<String> intereses();
	public void notificar(Partido partido);
}
