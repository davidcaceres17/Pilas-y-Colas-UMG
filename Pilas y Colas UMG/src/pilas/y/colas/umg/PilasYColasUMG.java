package pilas.y.colas.umg;
/**
 *
 * @author Shelly Pam
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class PilasYColasUMG {


    public static void main(String[] args) {
        int i=-10000000;
        int f=10000000;
        int r=0;
        int op;
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        int  nodo_informacion = 0;
        Cola cola = new Cola();
    
    do {

            try {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Generar Millon de Numeros\n"
                        + "2. Pilas\n"
                        + "3. Colas\n"
                        + "4. Salir.\n\n"));

                switch (opcion) {
                     
                    case 1:
                         for(r=1; r<=1000000; r++){
                    Random aleatorio = new Random();
                    nodo_informacion=aleatorio.nextInt(f - i+1) +i;
                    nodo=aleatorio.nextInt(f - i+1) +i;
                     pila.InsertarNodoPila(nodo);
                     cola.InsertarCola(nodo_informacion);
                     
                  // System.out.println(nodo);   
                  
                         }                        
                        break;
                        
                    case 2:
                        
                        //Pilas
                        do {
                           try {

                                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Menú de Opciones\n\n"
                                        + "1. Insertar un nodo\n"
                                        + "2. Eliminar un nodo\n"
                                        + "3. Ultimo nodo ingresado\n"
                                        + "4. Vaciar Pila\n"
                                        + "5. Mostrar contenido de la Pila\n"
                                        + "6. Salir.\n\n"));

                                switch (opcion) {
                                    case 1:

                                        for(r=0; r<=0; r++){
                                    Random aleatorio = new Random();
                                     nodo=aleatorio.nextInt(f - i+1) +i;
                                        pila.InsertarNodoPila(nodo);}
                                        break;

                                    case 2:
                                          
                                        if(!pila.PilaVacia()){
                                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                            + pila.EliminarNodoPila());
                                        }else {
                                            JOptionPane.showMessageDialog(null, "La pila esta vacia."); }
                                        break;

                                    case 3:
                                       if(!pila.PilaVacia()){
                                            JOptionPane.showMessageDialog(null, "El último valor ingresado en la pila es: "
                                             + pila.UltimoIngresoPila());
                                        } else {
                                            JOptionPane.showMessageDialog(null, "La pila esta vacia"); }
                                        break;

                                    case 4:
                                        if(!pila.PilaVacia()){
                                            pila.VaciarPila();
                                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                                        } else {
                                            JOptionPane.showMessageDialog(null, "La pila esta vacia"); }
                                        break;

                                    case 5:
                                       pila.MostrarPila();
                                        break;

                                    case 6:
                                        opcion = 6;
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Error");
                                        break;
                                }


                            } catch (NumberFormatException e) {

                            }
                        } while (opcion != 6);
                        break;
                        
                    case 3:
                        //Colas
                                        do {

                         try {

                             opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                     "Menú de Opciones\n\n"
                                     + "1. Insertar un nodo\n"
                                     + "2. Extraer un nodo\n"
                                     + "3. Mostrar contenido de la Cola\n"
                                     + "4. Salir.\n\n"));

                             switch (opcion) {
                                 case 1:

                                      for(r=0; r<=0; r++){
                                 Random aleatorio = new Random();
                                  nodo_informacion=aleatorio.nextInt(f - i+1) +i;
                                     cola.InsertarCola(nodo_informacion);}

                                     break;
                                 case 2:
                                     if (!cola.ColaVacia()) {
                                         JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " 
                                                 + cola.EliminarCola());
                                     } else {
                                         JOptionPane.showMessageDialog(null, "La cola esta vacía");
                                     }
                                     break;
                                 case 3:
                                     cola.MostrarCola();
                                     break;
                                 case 4:
                                     opcion = 4;
                                     break;
                                 default:
                                     JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                                     break;
                             }

                         } catch (NumberFormatException e) {
                         }

                     } while (opcion != 4);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                        break;
                }
            
            } catch (NumberFormatException e) {
            
            }
        } while (opcion != 4);
    
    }
    
}
