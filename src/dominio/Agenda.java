package dominio;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
/**
 * Clase que representa una agenda de contactos
 
 */
public class Agenda implements Serializable{
    /**
     * Lista de contactos
     */   
    ArrayList<Contactos> agenda = new ArrayList<>();
    
    /**
     * Constructor de la clase
     */
    public void anadirContactos(Contactos contactos)
    {
        agenda.add(contactos);
        System.out.println("Añadido con éxtio");
        System.out.println("");
    }
    /**
     * Metodo que permite añadir un contacto a la lista de contactos
     * @param contactos
     */
    public void mostrarContactos()
    {
        if(agenda.isEmpty())
        {
            System.out.println("La agenda está vacía");
            System.out.println("");
        }
        else
        {
            for(Contactos n : agenda)
            {   
                System.out.println(n);            
            }  
        }      
    }
    /**
     * Metodo que permite eliminar los contactos de la lista
     */
    public void eliminarContacto(String nombreEliminado)
    {
        for (int i = 0; i < agenda.size(); i++) 
        {
            Contactos contacto = agenda.get(i);
            if (contacto.getNombre().equalsIgnoreCase(nombreEliminado)) 
            {
                agenda.remove(i);
                System.out.println("Contacto eliminado correctamente");
                System.out.println("");
            }
            else
            {
                System.out.println("No se econtró nigún usuario");
                System.out.println("");
            }
        }

    }
    /**
     * Metodo que permite modificar los contactos de la lista
     */
    public void modificarUsuario(String modificarN, Contactos contactos)
    {
        for(int i = 0; i<agenda.size(); i++)
        {
            Contactos contacto = agenda.get(i);
            {
                System.out.println("¿Qué desea cambiar?");
                System.out.println("1) Nombre");
                System.out.println("2) Numero");
                Scanner lectorz = new Scanner(System.in);
                Scanner lectorOpcion = new Scanner(System.in);
                int opcionpp = lectorOpcion.nextInt();
                if(opcionpp==1)
                {
                    if(modificarN.equals(contacto.getNombre()))
                    {
                        System.out.print("Introduzca el nuevo nombre: ");
                        contacto.setNombre(lectorz.nextLine());
                        System.out.println("Nombre cambiado");
                        System.out.println("");

                    }
                }
                if(opcionpp==2)
                {
                    if(modificarN.equals(contacto.getNombre()))
                    {
                        System.out.print("Introduzca el nuevo numero: ");
                        contacto.setNumero(lectorz.nextLine());
                        System.out.println("Numero cambiado");
                        System.out.println("");

                    }
                }           
            }
        }
       
    }
}