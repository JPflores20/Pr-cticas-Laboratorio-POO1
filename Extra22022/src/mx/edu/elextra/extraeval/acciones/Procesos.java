package mx.edu.elextra.extraeval.acciones;
import javax.swing.*;
import java.awt.*;
public class Procesos{
	ArrayList<Dispositivo> lista=new ArrayList();
	private int idx = 0; //indice para moverse en el ArrayList
	
	private Procesos(){}

	public void getPrev(JTextField marca, JTextField costo, JTextField ramP , JLabel indice){
		// Si el tamaño de la lista es 0 llamar a JOptionPane siguiente y terminar el método
		if (lista.size()==0) {
			JOptionPane.showMessageDialog(null, "Lista vacia");
			return;
		}
		// restar a idx 1; en caso de ser 0 no realizar la resta
		if (idx>0) {
			idx=idx-1;
		}
		// establecer la etiqueta del indice en el valor que corresponda; ejemplo 1/20
		indice.setText(idx+"/"+lista.size);
		llenarCampos(marca, costo, ramP);
	}
	public void getNext(JTextField marca, JTextField costo, JTextField ramP , JLabel indice){
		// Si el tamaño de la lista es 0 llamar a JOptionPane siguiente y terminar el método
		if (lista.size()==0) {
			JOptionPane.showMessageDialog(null, "Lista vacia");
			return;
		}
		if (idx<lista.size) {
			idx=idx+1;
		}
		// sumar a idx 1; en caso de ser igual al tamaño de la lista no hacer el incremento
		// establecer la etiqueta del indice en el valor que corresponda; ejemplo 20/20
		indice.setText(idx+"/"+lista.size);
		llenarCampos(marca, costo, ramP);
	}
	private void llenarCampos(JTextField marca, JTextField costo, JTextField ramp){
		Dispositivo dd=lista[idx];
		// Con los valores marca costo y ram/procesador mostrar en las cajas de texto
		marca.setText(dd.getMarca());
		costo.setText(dd.getCosto());
		// Considerar que puede ser una Computadora o un Celular
	}
	public void sortMarca(){
		if (lista==null) {
			return;
		}
		else{
			lista.sort
		}
	}
	public void sortCosto(){
		// Si la lista está vacía, no se ordena
		// Ordenar por Marca
	}
	public void openFile(){
		System.out.println("Nombre del archivo:");
		// Por medio de un Scanner obtener el nombre de un archivo
		// Verificar si el archivo existe
		// No existe se llama al siguiente JOptionPane y termina el método
			JOptionPane.showMessageDialog(null, "El archivo no existe");
		// Si el archivo existe crear un BufferedReader para leer el contenido del archivo
		// Con cada linea del archivo llamar al método
				agregarLinea(linea);
	}
	private void agregarLinea(String){
		// Separar la linea por comas ','
		// si no tiene 4 elementos mostrar el siguiente JOptionPane y terminar el método
			JOptionPane.showMessageDialog(null, "Formato incorrecto");
		// Con los datos separados por coma:
		// Si el primer elemento es una c, crear una Computadora y agregar a la lista
		// Si el primer elemento es una p, crear un Celular y agregar a la lista
		// para lo anterior se debe de verificar con un try que los datos se pueden convertir a numéricos
	}
}