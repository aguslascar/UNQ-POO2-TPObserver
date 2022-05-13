package EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AplicacionTest {
	
	Aplicacion app;
	Usuario agustin;
	Partido tenis;

	@BeforeEach
	void setUp() throws Exception {
		app = new Aplicacion();
		tenis = mock(Partido.class);
		agustin = new Usuario();
	}

	@Test
	void testRegistrarPartido() {
		when(tenis.deporte()).thenReturn("Tenis");
		app.registrarPartido(tenis);
		assertEquals(1, app.servidores().size());
	}
	
	@Test
	void testRegistrarPartidoYNotificar() {
		agustin.agregarInteres("Tenis");
		app.agregarSuscripcion(agustin);
		app.registrarPartido(tenis);
		verify(agustin).update(tenis);
	}
}
