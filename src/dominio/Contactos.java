package dominio;

public class Contactos {
    
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
    
    public String toString() {
        return  "--> Nombre: [" + nombre + "]  Telefono: [" + numero + "]";
    }
    
    
}
