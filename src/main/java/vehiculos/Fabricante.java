package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	public static ArrayList<Fabricante> fabricanteMasVendido = new ArrayList<Fabricante>();
	
	String nombre;
	Pais pais;
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	int cantidadVentas;

	
	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
		
		this.pais.cantidadVentas += 1;
		
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricanteMasVendido = null;
		int ventasActuales = 0;
		
		
		for (Fabricante fabricante : Fabricante.fabricanteMasVendido) {
			
			
			if (fabricante.cantidadVentas > ventasActuales) {
				
				fabricanteMasVendido = fabricante;
				ventasActuales = fabricante.cantidadVentas;
				
			}
			
			
		}
		
		
		return fabricanteMasVendido;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
