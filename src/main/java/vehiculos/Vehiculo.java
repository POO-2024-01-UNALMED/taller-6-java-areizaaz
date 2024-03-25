package vehiculos;

public class Vehiculo {
	
	static int CantidadVehiculos;
	
	String placa;
	String nombre;
	int puertas;
	int velocidadMaxima;
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	int precio;
	int peso;
	String traccion;
    Fabricante fabricante;
    
    
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
    
    
    
    public Vehiculo(String placa, String nombre, int peso, int velocidadMaxima, Fabricante fabricante, int puertas) {
    	
    	CantidadVehiculos ++;
    	this.placa = placa;
    	this.nombre = nombre;
    	this.peso = peso;
    	this.velocidadMaxima = velocidadMaxima;
    	this.fabricante = fabricante;
    	this.puertas = puertas;
    	
    	
    	contarFabricantePais();
    	
    	
    	
    	
    }
    
	public Vehiculo(String placa, int puertas, int velocidadMaxima,  String nombre, int precio, int peso, String traccion ,Fabricante fabricante) {
	    	
	    	CantidadVehiculos ++;
	    	
	    	this.placa = placa;
	    	this.nombre = nombre;
	    	this.peso = peso;
	    	this.velocidadMaxima = velocidadMaxima;
	    	this.fabricante = fabricante;
	    	this.puertas = puertas;
	    	this.traccion = traccion;
	    	this.precio = precio;
	    	
	    	
	    	contarFabricantePais();
	    	
	    	
	}
    
    

    
    
    public int getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public String getTraccion() {
		return traccion;
	}


	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}


	public int getPuertas() {
		return puertas;
	}


	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}


	public static String vehiculosPorTipo() {
    	
    	int cantidadAutomoviles = Automovil.cantidadAutomoviles;
    	int cantidadCamionetas = Camioneta.cantidadCamionetas;
    	int cantidadCamiones = Camion.cantidadCamiones;
    	
    	
    	String mensaje = "Automoviles: " + cantidadAutomoviles + "\n" +
    	"Camionetas: " + cantidadCamiones + "\n" +
    	"Camiones: " + cantidadCamiones;		
    	
    	return mensaje;
    	
    }
    
    static public void setCantidadVehiculos(int cantidad) {
    	
    	Vehiculo.CantidadVehiculos = cantidad;
    	
    }
    
    static public int getCantidadVehiculos() {
    	
    	return Vehiculo.CantidadVehiculos;
    	
    }
    
    
    

}
