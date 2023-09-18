package gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		VentanaGrandSlam v = new VentanaGrandSlam();
		v.setVisible(true);
		
		//VentanaClasificacion v2 = new VentanaClasificacion(v);
		//v2.setVisible(true);
		/*

		//1- CREO LAS CABECERAS PARA CADA TIPO DE DATO
		
		List<String> cabecerasTenista = new ArrayList<>();
			cabecerasTenista.add("Nombre");
			cabecerasTenista.add("Nacionalidad");
			cabecerasTenista.add("Ranking");
			cabecerasTenista.add("Victorias");
			cabecerasTenista.add("Victorias por torneo");
		
			// Crear una lista de cabeceras para Torneo
	    List<String> cabecerasTorneo = new ArrayList<>();
	        cabecerasTorneo.add("Codigo");
	        cabecerasTorneo.add("Nombre");
	        cabecerasTorneo.add("Ciudad");

	        // Crear una lista de cabeceras para Resultado
	    List<String> cabecerasResultado = new ArrayList<>();
	        cabecerasResultado.add("Año");
	        cabecerasResultado.add("Torneo");
	        cabecerasResultado.add("Campeon");
	        cabecerasResultado.add("Ranking Campeon");
	        cabecerasResultado.add("Nacionalidad Campeon");
	        cabecerasResultado.add("Subcampeon");
	        cabecerasResultado.add("Ranking Subcampeon");
	        cabecerasResultado.add("Nacionalidad Subcampeon");
	        cabecerasResultado.add("Resultado");
	        
	        
	        
	        //2- CREO LAS INSTANCIAS DE DIFERENTES DATOS
	        Torneo torneo = new Torneo("US2032", "US Open X", "US-New York", cabecerasTorneo);
	        Torneo torneo2 = new Torneo("ES2012", "ES Abierto X", "Madrid", cabecerasTorneo);
	        
	        HashMap<Torneo, Integer> mapa1 = new HashMap<>();
	        mapa1.put(torneo, 3);
	        mapa1.put(torneo2, 4);
	        Tenista tenista = new Tenista("Eneko", "España", 4, 10, mapa1, cabecerasTenista);
	        
	        Resultado resultado = new Resultado(2023, "USO2023", tenista.getNombre(), 2, tenista.getNacionalidad(), "Novak Djokovic", 1, "Serbia", "6-4, 6-3, 6-4", cabecerasResultado);

	
	        System.out.println(resultado.toString());
	        
	        */
	    
	}

}
