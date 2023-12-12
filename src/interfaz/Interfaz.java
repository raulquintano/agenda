package interfaz;
import dominio.Agenda;
import dominio.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 * Clase que representa la interfaz de la agenda
 */
public class Interfaz {

    private  ArrayList<Agenda> l;
    private  Scanner sc = new Scanner(System.in);
    private Agenda agenda = new Agenda();
    /**
     * Metodo que se usa para serializar la agenda
     */


    public void leer()
    {
        File f=new File("agenda.dat");
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
            l=(ArrayList<Agenda>)ois.readObject();
            ois.close();
        } catch (Exception e) {
            l=new ArrayList<Agenda>();
        }
    }
    /**
     * Metodo que graba un contacto a la lista de contactos
     * @param contactos
     */
    public void grabar(){
        File f=new File("agenda.dat");
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(agenda);
            oos.close();
            System.out.println("Grabado correctamente");
        } catch (Exception e) {
            System.out.print("Error al grabar");
        }
    }
}