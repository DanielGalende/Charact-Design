
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
}
