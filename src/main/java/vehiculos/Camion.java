package vehiculos;

public class Camion extends Vehiculo {
	
	int ejes;
	
	public static int cantidadCamiones;
	
	
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

	public Camion(String placa, String nombre, int peso, int velocidadMaxima, Fabricante fabricante, int puertas) {
		super(placa, nombre, peso, velocidadMaxima, fabricante, puertas);
		
		
		contarFabricantePais();
		
		Camion.cantidadCamiones ++;
		
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.traccion = "4X2";
		
	}

}
