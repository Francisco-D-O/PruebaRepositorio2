package numericos_calculoscopia;

import javax.swing.JOptionPane;
/**
 * Creo un método que nos diga si el númro introducido como String es o no un número positivo.
 * El método se hace con un boolean para que no se detenga la solicitud de datos sea cual sea 
 * el dato introducido. Se encuadra en un  try catch que captura un formato distinto a número.
 * Si el número es negativo se evalua con if else y se consigue que no se detenga hasta obtener 
 * el valor de número positivo al condicionar el do while a que la opción false (valorValido) pase a 
 * verdadera.
 * @author franciscodieguez
 *
 */
public class Positivo_Valor {
	
	public static double obtenerValorValido(String mensaje) {
        double valor = 0;
        boolean valorValido = false;
        do {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                valor = Double.parseDouble(input);
                if (valor > 0) {
                    valorValido = true;
                   
                } else {
                    JOptionPane.showMessageDialog(null, "El valor debe ser superior a cero.");
                    
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
            }
        } while (!valorValido);
       
        return valor;
    }
	
}
