package dominio;
import java.io.Serializable;

public class Contactos implements Serializable {
    
    private String nombre;
    private String numero;

    public Contactos(String nombre, String numero)
    {
        this.nombre = nombre;
        this.numero = numero;
    }
    public Contactos()
    {
        this.nombre = "";
        this.numero = "";
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public boolean equals (Object p){
        Contactos contacto = (Contactos) p;
        return nombre.equals(contacto.nombre);
    }
    
    public String toString() {
        return  "--> Nombre: [" + nombre + "]  Telefono: [" + numero + "]";
    }
    
    
}
