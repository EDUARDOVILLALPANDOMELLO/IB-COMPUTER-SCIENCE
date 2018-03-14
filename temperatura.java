import java.util.Scanner;
public class temperatura{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingresa un calor a convertir");
		Float TEMP = keyboard.nextFloat();
		System.out.println("Convertir a celcius [1] o farenheit [2]");
		Integer OPTION = keyboard.nextInt();
		System.out.println("");
		if(OPTION == 1){
			Float RESULTADO = (9/5)*TEMP+32;
			System.out.println(TEMP + "°F son " + RESULTADO + "°C");
		}
		else if(OPTION == 2){
			Float RESULTADO = ((TEMP-32)*5)/9;
			System.out.println(TEMP + "°C son " + RESULTADO + "°F");
		}
		else{
			System.out.println("Ingrese una opción válida");
		}
	}
}
