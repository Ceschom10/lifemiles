
package archivos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Cesar
 */
public class Archivos  {

    public static void main(String[] args) {
        
        String cadena, formatoOrigen, formatoDestino; 
        
        cadena= JOptionPane.showInputDialog(null,"ingrese la cadena a traducir");
        System.out.println("hola" + cadena);
        
         formatoOrigen= JOptionPane.showInputDialog(null,"formato origen");
        
         formatoDestino= JOptionPane.showInputDialog(null,"formato destino");
         
         Traductor trad = new Traductor();
         trad.traducir(cadena, formatoOrigen, formatoDestino);
        
            }
}
