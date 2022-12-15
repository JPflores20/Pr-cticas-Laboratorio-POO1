public class Dispositivo {

	private String marca;
	private float costo;

	public Dispositivo(String marca, float costo){
		this.marca=marca;
		this.costo=costo;
	}
	public String toString(){
		return marca + '\t' + costo;
	}

	public String getMarca(){
		return marca;
	}
	public float getCosto(){
		return costo;
	}
	//fin método get atributos

	//orden natural
	public int compareTo(Vehiculo vehiculo1){//uso de compare to para orden
		if ((this.marca.compareTo(vehiculo1.marca)) != 0){
			return (this.marca.compareTo(vehiculo1.marca));
		}

		if (this.modelo == modelo){
			return (this.modelo>vehiculo1.modelo)?(1):(-1);
		}
		return (this.costo > vehiculo1.costo)?(1):(-1);
	}
	
}