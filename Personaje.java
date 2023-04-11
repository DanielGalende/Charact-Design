
/**
 * Write a description of class Personaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personaje
{
    private String nombre;
    private String profesion;
    private Mascota mascota;
    
    public Personaje(String nombrePersonaje, String profesionNombre){
        profesion = profesionNombre;
        nombre = nombrePersonaje;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getProfesion(){
        return profesion;
    }
    
    public Mascota getMascota(){
        return mascota;
    }

    public void setnombreDelPersonaje(String nombrePersonaje)
    {
        nombre = nombrePersonaje  ;
    }
    
    public void setNombreProfesion(String tipoDeProfesion)
    {
        profesion = tipoDeProfesion ;
    }
    
    public void setMascota(Mascota tipoDeMascota){
        mascota = tipoDeMascota;
    }
    
    public void imprimirDetalles(){
        System.out.println("Nombre del Personaje: " + nombre + " A lo que se dedica: " + profesion + " Mascota del personaje " + mascota.getNombre() + mascota.getTipoDeMascota());
    }

}
