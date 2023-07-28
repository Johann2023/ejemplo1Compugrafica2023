
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Utilidades {
     public static boolean guardarArchivo (LinkedList<Cliente> ListaC){
        boolean t=false;
        try{
            String nombreArchivo = "clietes.txt";
            FileWriter fileWriter = new FileWriter (nombreArchivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            Iterable<Cliente> listaC;
            for (Cliente cliente: listaC){
                Writer.write(cliente.toString()+"\n");
                
            }
    }
     }
}
