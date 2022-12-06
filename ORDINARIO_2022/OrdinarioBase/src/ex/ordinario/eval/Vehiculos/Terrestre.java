public class Terrestre extends Vehiculo{//hereda de vehiculo
	int llantas; //atributo entero llamado llantas

	public Terrestre(String marca, int modelo, float costo, int llantas){
		super(marca, modelo, costo);
		this.llantas = llantas;
	}

	public String toString(){//agregar atributo llantas
		return super.toString() + "\t" + llantas;
	}
}