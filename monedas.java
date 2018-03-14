
import java.util.Scanner;
public class monedas{
	public static void main(String[] args){
		Scanner TECLADO = new Scanner(System.in);
		Integer DINERO;
		System.out.println("Ingrese un valor entero entre 1 y 99");
		DINERO = TECLADO.nextInt();
		
		Integer QUARTER = DINERO/25;
		DINERO = DINERO - QUARTER*25;

		Integer DIME = DINERO/10;
		DINERO = DINERO - DIME*10;

		Integer NICKEL = DINERO/5;
		DINERO = DINERO - NICKEL*5;

		Integer PENNY = DINERO;

		System.out.println(QUARTER + " Quarters");
		System.out.println(DIME + " Dimes");
		System.out.println(NICKEL + " Nickels");
		System.out.println(PENNY + " Pennies");
	}
}
