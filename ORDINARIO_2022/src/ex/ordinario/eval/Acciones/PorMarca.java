package ex.ordinario.eval.Acciones;
import java.util.Comparator;
import  ex.ordinario.eval.Vehiculos.*;

public class PorMarca implements Comparator<Vehiculo>{
	public int compare (Vehiculo vehiculo1, Vehiculo vehiculo2){
	
		if (vehiculo1.getMarca().compareTo(vehiculo2.getMarca()) != 0){
			return (vehiculo1.getMarca().compareTo(vehiculo2.getMarca()));
		}
		if (vehiculo1.getModelo() != vehiculo2.getModelo()) {
	
		return (vehiculo2.getModelo() < vehiculo1.getModelo()) ? -1 : 1;		
		}
		if (vehiculo1.getCosto() != vehiculo2.getCosto()) {
	
			return (vehiculo2.getCosto() < vehiculo1.getCosto()) ? -1 : 1;		
		}
		return 0;
	}
}