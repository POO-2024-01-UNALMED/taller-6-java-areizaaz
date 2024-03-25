package vehiculos;

public class Automovil extends Vehiculo {
	
	int puestos;
	
	public static int cantidadAutomoviles;
	
	
	public  void contarFabricantePais() {
    	
    	//Paises
    	
		if (Pais.paisesVendidos.contains(fabricante.pais)) {
		    		
		    		
    		int i = Pais.paisesVendidos.indexOf(fabricante.pais);
    		
    		Pais.paisesVendidos.get(i).cantidadVentas += 1;
		    		
		    		
		 }
		
		else {
			Pais.paisesVendidos.add(fabricante.pais);
		}
		
		
		//Fabricante
		
		if (Fabricante.fabricanteMasVendido.contains(fabricante)) {
    		
    		
    		int i = Fabricante.fabricanteMasVendido.indexOf(fabricante);
    		
    		Fabricante.fabricanteMasVendido.get(i).cantidadVentas += 1;
		    		
		    		
		 }
		
		else {
			Fabricante.fabricanteMasVendido.add(fabricante);
		}
		
		
		
	    	
	  }
	

    
	public Automovil(String placa, String nombre, int peso, int velocidadMaxima, Fabricante fabricante, int puertas) {
		super(placa,  nombre, peso, velocidadMaxima, fabricante, puertas);
		
		
		contarFabricantePais();
		
		Automovil.cantidadAutomoviles++;

		this.puertas = 4;
		this.velocidadMaxima = 100;
		this.traccion = "FWD";
		
		
		
		
		
	}
	

}
