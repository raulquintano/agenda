package dominio;
import java.io.Serializable;

/**
 * Clase contacto representa un contacto de una libreta de contactos.
 */
public class Contactos implements Serializable {
    /**
     * Nombde del contacto
     */
    private String nombre;
    private String numero;

    /**
     * Constructor de la clase con los siguientes parametros:
     * @param nombre
     * @param numero
     */ 
    public Contactos(String nombre, String numero)
    {
        this.nombre = nombre;
        this.numero = numero;
    }
    /**
     *  Constructor de la clase sin parametros
     */
    public Contactos()
    {
        this.nombre = "";
        this.numero = "";
    }
    
    /**
     * Metodo que permite modificar el nombre del contacto
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * Metodo que permite obtener el nombre del contacto
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }
    /**
     * Metodo que permite comparar dos contactos
     */
    public boolean equals (Object p){
        Contactos contacto = (Contactos) p;
        return nombre.equals(contacto.nombre);
    }
    /**
     *  Metodo que permite obtener la informacion del contacto
     */
    public String toString() {
        return  "--> Nombre: [" + nombre + "]  Telefono: [" + numero + "]";
    }
    
    
}
