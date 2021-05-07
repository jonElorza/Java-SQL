package Front;

import java.util.ArrayList;

import AccesoDatos.DaoBandas;
import Entidades.Bandas;

public class Front {

	public static void main(String[] args) {
		mostrarTodos();
		
		Bandas banda1 = DaoBandas.obtenerPorId(1);
		System.out.println(banda1);
		
		
		
		
		
	}
	
	
	
	private static void mostrarTodos() {
		for(Bandas banda: DaoBandas.obtenerTodos()) {
			System.out.println(banda);
		}		
	}



}
