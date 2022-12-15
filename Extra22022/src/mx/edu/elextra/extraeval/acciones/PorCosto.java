package mx.edu.elextra.extraeval.acciones;
import mx.edu.elextra.extraeval.dispositivos.Dispositivo;
import java.util.Comparator;
public class PorCosto implements Comparator<Dispositivo>{
	public int compare(Dispositivo d1,Dispositivo d2){
		float tmp = d1.getCosto() - d2.getCosto();
		if (tmp==0.0f) {
			return d1.getMarca().compareTo(d2.getMarca());
		}
		if (tmp>0) {
			return 1;
		}
		else{
			return -1;
		}
	}
}