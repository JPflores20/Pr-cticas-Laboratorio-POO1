public class Celular extends Dispositivo{
	private float procesador;
	public Celular(String marca, float costo, float procesador){
		super(marca,costo);
		this.procesador=procesador;
	}

	public float getProcesador(){
		return procesador;
	}

	public String toString(){
		return super.toString()+"\t"+procesador;
	} 

}