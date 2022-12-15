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
	public int compareTo(Dispositivo o){
		int valor = marca.compareTo(o.getMarca());
		int cos1;
		int cos2;
		if (valor!=0){
			return valor;
		}
		return (int)(costo) - (int)(o.getCosto());

	}
	
}