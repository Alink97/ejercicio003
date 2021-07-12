package ejercicio003;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {

	private Agenda agenda;
	
	@BeforeEach
	void setUp() throws Exception {
		agenda = new Agenda();
	}

	@Test
	void testAleatorio() {
		List<String> lista = new ArrayList<>();
		
		lista.add(agenda.pedirNombre());
		assertTrue(lista.size() == 1);
	}

}
