
package pilas.y.colas.umg;
/**
 *
 * @author Shelly Pam
 */
import javax.swing.JOptionPane;

public class Pila {
    
     private NodoPila UltimoIngreso;
    int tamaño = 0;
    String lista = "";
    
    public Pila(){
        UltimoIngreso = null;
        tamaño = 0;
    }
    
    
    
    public void InsertarNodoPila(int nodo){
        NodoPila nuevo_nocdo = new NodoPila(nodo);
        nuevo_nocdo.next = UltimoIngreso;
        UltimoIngreso = nuevo_nocdo;
        tamaño++;
    }        
    
    
    public int EliminarNodoPila(){
        int auxiliar = UltimoIngreso.info;
        UltimoIngreso = UltimoIngreso.next;
        tamaño--;
        return auxiliar;
    }
    
    
    public int UltimoIngresoPila(){
        return UltimoIngreso.info;
    }
    
    public boolean PilaVacia(){
        return UltimoIngreso == null;
    }
    
    public void VaciarPila(){
        while (!PilaVacia()) {
            EliminarNodoPila();            
        }
    }
    
   
    public void MostrarPila(){
        NodoPila recorrido = UltimoIngreso;
        
        while(recorrido != null){
            lista += recorrido.info + "\n";
            recorrido = recorrido.next;
        }
       System.out.println(lista);
        //JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
}

