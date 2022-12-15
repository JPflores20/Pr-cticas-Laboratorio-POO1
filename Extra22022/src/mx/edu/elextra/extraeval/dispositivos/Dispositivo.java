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
	public int compareTo(Dispositivo dispositivo1){//uso de compare to para orden
		if ((this.marca.compareTo(dispositivo1.marca)) != 0){
			return (this.marca.compareTo(dispositivo1.marca));
		}

		if (this.costo == costo){
			return (this.costo>dispositivo1.costo)?(1):(-1);
		}
		return (this.costo > dispositivo1.costo)?(1):(-1);
	}
	
}