package interfaz;
import dominio.Agenda;
import dominio.*;
import java.io.*;
import java.util.*;

public class Interfaz {

    private  ArrayList<Agenda> l;
    private  Scanner sc = new Scanner(System.in);
    private Agenda agenda = new Agenda();

     public Interfaz(){
        File f=new File("agenda.dat");
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
            l=(ArrayList<Agenda>)ois.readObject();
            ois.close();
        } catch (Exception e) {
            l=new ArrayList<Agenda>();
        }
    }
 
    public void grabar(){
        File f=new File("agenda.dat");
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(agenda);
            oos.close();
        } catch (Exception e) {
            System.out.print("Error al grabar");
        }
    }
}