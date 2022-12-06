package ex.ordinario.eval.Vehiculos;
public class Acuatico extends Vehiculo{//hereda de vehiculo
	boolean remos;//atributo booleano remos

	public Acuatico(String marca, int modelo, float costo, boolean remos){
		super(marca, modelo, costo);
		this.remos = remos;
	}
	public String toString(){//agregar atributo remos
		return super.toString() +"\t"+ remos;
	}
}