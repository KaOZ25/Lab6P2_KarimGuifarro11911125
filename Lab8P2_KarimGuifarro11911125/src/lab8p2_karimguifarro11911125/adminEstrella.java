package lab8p2_karimguifarro11911125;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminEstrella {
    
    private ArrayList<Estrella> listaEstrella = new ArrayList();
    private File archivo = null;
    
    public adminEstrella(String path) {
        archivo = new File(path);
    }

    public ArrayList<Estrella> getListaEstrella() {
        return listaEstrella;
    }

    public void setListaEstrella(ArrayList<Estrella> listaEstrella) {
        this.listaEstrella = listaEstrella;
    }

   

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setAlumno(Estrella a){
        listaEstrella.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaEstrella = new ArrayList();
            Estrella temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Estrella) objeto.readObject()) != null) {
                        listaEstrella.add(temp);
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
            for (Estrella t : listaEstrella) {
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
