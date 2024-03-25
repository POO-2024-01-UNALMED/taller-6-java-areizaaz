package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	public static ArrayList<Pais> paisesVendidos = new ArrayList<Pais>();
	
	String nombre;
	int cantidadVentas;
	
	public Pais(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	
	public static Pais paisMasVendedor() {
		
		Pais paisMasVendido = null;
		int ventasActuales = 0;
		
		
		for (Pais pais : Pais.paisesVendidos) {
			
			
			if (pais.cantidadVentas > ventasActuales) {
				
				paisMasVendido = pais;
				ventasActuales = pais.cantidadVentas;
				
			}
			
			
		}
		
		
		return paisMasVendido;
		
		
		
	}
	
	public String getNombre(){
		return this.nombre;
	}
	

}
