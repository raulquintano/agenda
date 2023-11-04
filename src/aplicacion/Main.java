
import dominio.Contactos;
import dominio.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Agenda agenda = new Agenda();
        Scanner lector = new Scanner(System.in);
        int opcion;
        boolean salir = true;
        
        do
        {
            System.out.println("1) Añadir contacto");
            System.out.println("2) Mostrar contactos");
            System.out.println("3) Eliminar contacto");
            System.out.println("4) Modificar Usuario");
            System.out.println("5) Salir");
            opcion = lector.nextInt();
            Scanner lectorNombre = new Scanner(System.in);

            switch(opcion)
            {
                case 1:
                    Contactos contactos = new Contactos();

                    System.out.print("Diga el nombre: ");
                    String nuevoNombre = lectorNombre.nextLine();
                    contactos.setNombre(nuevoNombre);
                    
                    System.out.print("Diga su numero: ");
                    String nuevoNumero = lectorNombre.nextLine();
                    contactos.setNumero(nuevoNumero);
                    agenda.anadirContactos(contactos);
                    break;
                
                case 2:
                    agenda.mostrarContactos();
                    break;
                
                case 3:
                    contactos = new Contactos();
                    System.out.print("Diga el nombre del contacto que desea eleiminar: ");  
                    String nombreEliminado = lectorNombre.nextLine();
                    agenda.eliminarContacto(nombreEliminado);
                    break;
                
                case 4:
                    contactos = new Contactos();

                    System.out.println("¿Qué usuario desea modificar?");
                    String modificarN = lectorNombre.nextLine();
                    agenda.modificarUsuario(modificarN, contactos);
                    break;
                
                case 5:
                    System.out.println("Agenda Cerrada");
                    salir = false;
                    break;
                
            }
                
        }
        while(opcion!=5);
        
    }
    
}
