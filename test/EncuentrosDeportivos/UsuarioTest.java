package EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {

	Aplicacion app;
	Usuario agustin;
	Partido tenis;
	
	
	@BeforeEach
	void setUp() throws Exception {
		app = mock(Aplicacion.class);
		agustin = new Usuario("tenis");
		tenis = mock(Partido.class);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
