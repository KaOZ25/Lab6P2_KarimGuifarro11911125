package lab8p2_karimguifarro11911125;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminJugador {
    
    private ArrayList<Jugador> listaJugador = new ArrayList();
    private File archivo = null;
    
    public adminJugador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jugador> getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(ArrayList<Jugador> listaJugador) {
        this.listaJugador = listaJugador;
    }

   
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setAlumno(Jugador a){
        listaJugador.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaJugador = new ArrayList();
            Jugador temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Jugador) objeto.readObject()) != null) {
                        listaJugador.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Jugador t : listaJugador) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
}
