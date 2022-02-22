
package pilas.y.colas.umg;

import javax.swing.JOptionPane;

/**
 *
 * @author Shelly Pam
 */
public class Cola {
    private NodoCola inicioc, finalc;
    String Cola = "";
    
    public Cola(){
        inicioc = null;
        finalc = null;
    }
    
    //Método para saber si la cola esta vacia
    public boolean ColaVacia(){
        if (inicioc == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Método para insertar a la cola
    public void InsertarCola(int informacion){
        NodoCola nuevo_nodo = new NodoCola();
        nuevo_nodo.infcola = informacion;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            inicioc = nuevo_nodo;
            finalc = nuevo_nodo;
        } else {
            finalc.siguiente = nuevo_nodo;
            finalc = nuevo_nodo;
        }
    }
    
    //Método para extraer de la cola
    public int EliminarCola(){
        if (!ColaVacia()) {
            int informacion = inicioc.infcola;
            
            if (inicioc == finalc) {
                inicioc = null;
                finalc = null;
            } else {
                inicioc = inicioc.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void MostrarCola(){
        NodoCola recorrido = inicioc;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.infcola + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" ");
        
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += "\n " +cadena[i];                    
        }
        
        System.out.println(ColaInvertida);
        //JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = " ";
    }
}


