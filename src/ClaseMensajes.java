
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClaseMensajes {

    private File archivo = null;

    public ClaseMensajes(String path) {
        archivo = new File(path);

    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Chats" + archivo;
    }
    
    
    
    public void escribirArchivo(String mensaje) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            bw.write(mensaje + ",");

            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
        
    }

}
