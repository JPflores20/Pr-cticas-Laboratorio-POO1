public class Alumno{
    private String nombre;
    private int promedio;
    
    public Alumno(String nombre, int promedio){
        this.nombre = nombre;
        this.promedio = promedio;
    }
    
    public Alumno(String nombre){
        this(nombre,0);
    }
    /******************************************** */
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    /********************************************** */


    /********************************************** */
    public int getPromedio(){
        return promedio;
    }

    public void setPromedio(int prom){
        this.promedio = prom;
    }
    /********************************************** */


    
    
    /******************Método getDetalle**************** */
    public String getDetalle(){
        return nombre + " " + promedio;
    }
    /******************Fin método************************ */
    

}