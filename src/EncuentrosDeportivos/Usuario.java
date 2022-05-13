package EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements IListener {
	
	private List<String> intereses = new ArrayList<String>();

	public void agregarInteres(String interes) {
		intereses.add(interes);
	}
	
	@Override
	public void update(Partido partido) {
		intereses.add("agrego");
		
	}

	@Override
	public List<String> intereses() {
		return intereses;
	}
	
	
}
