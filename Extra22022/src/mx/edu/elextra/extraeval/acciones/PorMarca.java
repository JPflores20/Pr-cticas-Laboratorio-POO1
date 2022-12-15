package mx.edu.elextra.extraeval.acciones;
import mx.edu.elextra.extraeval.dispositivos.Dispositivo;
import java.util.Comparator;
public class PorMarca implements Comparator<Dispositivo>{
	public int compare(Dispositivo d1,Dispositivo d2){
		int valor = d1.getMarca().compareTo(d2.getMarca());
		if (valor!=0){
			return valor;
		}
		return (int)(d1.getCosto()) - (int)(d2.getCosto());
	}
}