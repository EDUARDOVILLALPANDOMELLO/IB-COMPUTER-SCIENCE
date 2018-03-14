import java.util.Scanner;
import java.lang.Math;

public class circulo{
	public static void main (String[] args){
		float RADIO, AREA;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuál es tu nombre?");

		String NOMBRE = teclado.nextLine(); 
		System.out.println("Hola "+NOMBRE+" ingrese el valor del radio");
		RADIO = teclado.nextFloat();
		System.out.println("El resultado es:");
		System.out.println(Math.PI*RADIO*RADIO + "m2");
	}
}
