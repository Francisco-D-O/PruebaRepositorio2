package numericos_calculoscopia;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalculosNumericos {

	public static void main(String[] args) {
		double valor = Positivo_Valor.obtenerValorValido(
				"Ingrese un Valor Numérico Positivo y superior a Cero, para calcular su  Número Neperiano: ");

		/**
		 * Se crea el Objeto df de DecinalFormat, el cual nos permite decir que número
		 * de decimales obtendremos en la salida.
		 */
		DecimalFormat df = new DecimalFormat("# 0.000000");

		/**
		 * Se invoca a los métodos Static con el nombre de la clase antes del . , al ser
		 * static nos permite llamar al método sin tener que crear un Objeto de esa
		 * clase
		 * 
		 */
		double resultadoNp = MetodoNeperiano.calcularNeperiano(valor);
		JOptionPane.showMessageDialog(null, "El resultado del cálculo neperiano es: " + df.format(resultadoNp));

		double valorR = Positivo_Valor.obtenerValorValido(
				"Ingrese un Valor Numérico Positivo y superior a Cero para calcular su Raiz Cuadrada: ");

		double resultadoR = MetodoRaizCuadrada.calcularRaizCuadra(valorR);
		JOptionPane.showMessageDialog(null, "El resultado del cálculo raíz cuadrada es: " + df.format(resultadoR));
	}

}
