public class Computadora extends Dispositivo{
	private int ram;
	public Computadora(String marca, float costo, int ram){
		super(marca,costo);
		this.ram=ram;
	}

	public int getRam(){
		return ram;
	}

	public String toString(){
		return super.toString()+ "\t" +ram;
	}
}