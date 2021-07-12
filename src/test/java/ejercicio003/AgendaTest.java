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
	
	@Test
	void testListaNombres() {
		List<String> lista = new ArrayList<>();
		
		List<String> listaAux = agenda.variosNombres(3);
		
		for(String s:listaAux) {
			lista.add(s);
		}
		assertTrue(lista.size() == 3);
	}

}
