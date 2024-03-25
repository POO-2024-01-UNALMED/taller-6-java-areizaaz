package vehiculos;

public class Camioneta extends Vehiculo {
	
	boolean volco;
	
	public static int cantidadCamionetas;
	
	
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

	public Camioneta(String placa, int puertas , String nombre, int peso, int velocidadMaxima, Fabricante fabricante, boolean volco) {
		super(placa, nombre, peso, velocidadMaxima, fabricante, puertas);
		
		
		contarFabricantePais();
		
		Camioneta.cantidadCamionetas++;
		
		this.velocidadMaxima = 90;
		this.traccion = "4X4";
		this.volco = volco;
		
	}

}
