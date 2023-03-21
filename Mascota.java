
/**
 * Write a description of class Mascota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mascota
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String tipoDeMascota;

    /**
     * Constructor for objects of class Mascota
     */
    public Mascota(String Nombre, String TipoDeMascota)
    {
        Nombre = nombre;
        TipoDeMascota = tipoDeMascota;
        
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getTipoDeMascota(){
        return tipoDeMascota;
    }
    
    public void setNombre(String nombreMascota){
        nombreMascota = nombre;
    }
    
    public void setTipoDeMascota(String tipoMascota){
        tipoMascota = tipoDeMascota;
    }
    
    public void imprimirDetalles(){
        System.out.println("Nombre de la mascota: " + nombre + "Tipo de Mascota: " + tipoDeMascota);  
    }
}

