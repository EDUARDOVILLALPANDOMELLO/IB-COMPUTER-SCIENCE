import java.util.*;
public class Entrada{
	public static void main (String args[]){
		Scanner TECLADO = new Scanner (System.in);
		System.out.println("HOLA, ¿CÓMO TE LLAMAS?");
		String NOMBRE= TECLADO.nextLine();
		System.out.println("HOLA "+NOMBRE+", VAMOS A HACER A/B");
		System.out.print("Ingrese el valor de [a] ");
		int INT_A = TECLADO.nextInt();
		System.out.print("Ingrese el valor de [b] ");
		int INT_B = TECLADO.nextInt();
		
		if(INT_B>0){
			float RESULTADO = INT_A/INT_B;
			int RESIDUO = INT_A%INT_B;
			Sys
}
