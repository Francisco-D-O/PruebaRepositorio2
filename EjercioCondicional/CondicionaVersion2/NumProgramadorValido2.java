
package CondicionaVersion2;

import java.util.Scanner;

public class NumProgramadorValido2 {
	
	public static  int ObtenerNunPrograValido () throws Exception{
		
		Scanner keyboard = new Scanner(System.in);
		
		int NumProgramadores = 0;
		
		
		try{
			System.out.println("Introduce número de Programadores, mínimo 2 Máximo 3. ");
		NumProgramadores=Integer.parseInt(keyboard.nextLine());
		
		
			
		
		while (!(NumProgramadores == 2) || (NumProgramadores == 3)) {
			
			System.out.println("Mínimo de programadores aceptados 2 máximo 3. ");
			NumProgramadores=Integer.parseInt(keyboard.nextLine());
			System.out.println("Introduce número de Programadores, mínimo 2 Máximo 3. ");
			NumProgramadores=Integer.parseInt(keyboard.nextLine());
			
		}
		}catch(NumberFormatException e) {
			System.out.println("ERROR!! Pulse Play nuevamente e introduzca un 2 o un 3. ");
			
		
	}return NumProgramadores;
		
		}	
	
	public static void main (String[] args) throws Exception {
		
	NumProgramadorValido2.ObtenerNunPrograValido();
	
	}
	}