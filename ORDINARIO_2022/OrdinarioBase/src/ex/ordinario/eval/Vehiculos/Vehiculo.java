public class Vehiculo {
	//Atributos privados
	private String marca;
	private int modelo;
	private float costo;

	//Constructor recibe 3 argumentos
	public Vehiculo(String marca, int modelo, float costo){
		this.marca = marca;
		this.modelo = modelo;
		this.costo = costo;
	}

	//El método toString devuelve los 3 argumentos separados por un tabulador
	public String toString(){
		return marca +"\t"+ modelo +"\t"+ costo;
	}

	//Cada atributo debe tener su método get
	public String getMarca(){
		return marca;
	}
	public int getModelo(){
		return modelo;
	}
	public float getCosto(){
		return costo;
	}
	// fin métodos get de atributos

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