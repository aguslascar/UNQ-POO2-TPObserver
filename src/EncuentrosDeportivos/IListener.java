package EncuentrosDeportivos;

import java.util.List;

public interface IListener {

	public void update(Partido partido);
	public List<String> intereses();
}
