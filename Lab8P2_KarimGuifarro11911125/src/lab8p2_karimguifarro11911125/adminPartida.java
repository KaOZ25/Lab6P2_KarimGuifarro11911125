package lab8p2_karimguifarro11911125;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminPartida {
    
    private ArrayList<Partida> listaPartida = new ArrayList();
    private File archivo = null;
    
    public adminPartida(String path) {
        archivo = new File(path);
    }

    public ArrayList<Partida> getListaPartida() {
        return listaPartida;
    }

    public void setListaPartida(ArrayList<Partida> listaPartida) {
        this.listaPartida = listaPartida;
    }

 

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setAlumno(Partida a){
        listaPartida.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaPartida = new ArrayList();
            Partida temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Partida) objeto.readObject()) != null) {
                        listaPartida.add(temp);
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
            for (Partida t : listaPartida) {
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
