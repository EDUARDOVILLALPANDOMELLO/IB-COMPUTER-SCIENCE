import java.util.*;
public class Ordenar {
	public static void main(String[] args){
		Scanner TECLADO = new Scanner(System.in);
		int TIMES = 0;
		int SUMA = 0;
		int[] NUMEROS = new int[10];
		while(TIMES<10){
			System.out.println("["+TIMES+"] ");
			int INGRESO = TECLADO.nextInt();
			NUMEROS[TIMES] = INGRESO;
			SUMA = SUMA + INGRESO;
			TIMES++; 
		}
		double PROMEDIO = SUMA/10;
		System.out.println("======================");
		System.out.println(Arrays.toString(NUMEROS));


		Arrays.sort(NUMEROS);

		System.out.println("ORDENADOS\t"+Arrays.toString(NUMEROS)); 

		System.out.println("MINIMO "+NUMEROS[0]);
		System.out.println("MAXIMO "+NUMEROS[9]);
		System.out.println("PROMEDIO" + PROMEDIO);

		int[] POSITIVOS = new int[10];
		int[] NEGATIVOS = new int[10];
		for(int NUMEROS_NEG: NUMEROS){
			if(NUMEROS_NEG<0){
				POSITIVOS[POSITIVOS.length-1] = NUMEROS_NEG;
			} else {
				NEGATIVOS[POSITIVOS.length-1] = NUMEROS_NEG;
			}
		}

		System.out.println("POSITIOVS"+Arrays.toString(POSITIVOS));
		System.out.println("NEGATIVOS"+Arrays.toString(NEGATIVOS)); 
	}

}
