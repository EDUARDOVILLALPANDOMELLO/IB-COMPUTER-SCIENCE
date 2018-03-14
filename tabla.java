import java.util.*;
public class tabla{
	public static void main(String[] args){
		String[][] TABLA = new String[5][2];
		Scanner TECLADO = new Scanner(System.in);
		int COUNT = 0;
		int SUMA = 0;
		while(COUNT<5){
			String[] FILA = new String[2];
			System.out.println("INGRESE EL NOMBRE");
			String NOMBRE = TECLADO.nextLine();
			System.out.println("INGRESE LA CALIFACION");
			String CALIFICACION = TECLADO.nextLine();
			FILA[0] = NOMBRE;
			FILA[1] = CALIFICACION;
			TABLA[COUNT]=FILA;
			int CALIFICACION_INT = Integer.parseInt(CALIFICACION);
			SUMA = SUMA + CALIFICACION_INT;
			COUNT++; 
		}
		for(int i=0; i<TABLA.length; i++){
			for(int j=0; j<TABLA[i].length; j++){
				System.out.print(TABLA[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("EL PROMEDIO ES " + SUMA/5);
	}
}
