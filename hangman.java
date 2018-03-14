import java.util.*;
public class hangman{
	public static void main (String[] args){
		Scanner TECLADO = new Scanner(System.in);
		System.out.println("INGRESE UNA PALABRA");
		String PALABRA = TECLADO.nextLine();
		char[] LETRAS_ARRAY = new char[PALABRA.length()];
		char[] LETRAS_ARRAY_SOLVE = new char[PALABRA.length()];
		for(int i = 0; i<PALABRA.length(); i++){
			LETRAS_ARRAY[i]=PALABRA.charAt(i);
			LETRAS_ARRAY_SOLVE[i] = '_';
			//LETRAS_ARRAY.push(PALABRA.charAt(i));
			//System.out.println(LETRAS_ARRAY[i]);
		}
		System.out.println("¿Quieres una pista? [SI] [NO]");
		String PISTA = TECLADO.nextLine();
		if(PISTA.equals("SI")){
			LETRAS_ARRAY_SOLVE[0] = LETRAS_ARRAY[0];
			LETRAS_ARRAY_SOLVE[PALABRA.length()-1] = LETRAS_ARRAY[PALABRA.length()-1];
		}
		else{
		
		}
		System.out.println(Arrays.toString(LETRAS_ARRAY_SOLVE));
		int CONTAR = 0;

		//Arrays.sort(LETRAS_ARRAY_SOLVE);
		//Arrays.sort(LETRAS_ARRAY); 
		while(CONTAR < 5 && Arrays.binarySearch(LETRAS_ARRAY_SOLVE, '_') >= 0){
			System.out.println(""); 
			char OPCION = TECLADO.nextLine().charAt(0);
			System.out.println(Arrays.binarySearch(LETRAS_ARRAY, OPCION)); 
			if(Arrays.binarySearch(LETRAS_ARRAY, OPCION) >= 0 && Arrays.binarySearch(LETRAS_ARRAY_SOLVE, OPCION) < 0){
				int LETRA_INDEX = 0;
				for(char l: LETRAS_ARRAY){
					if(l == OPCION){
						LETRAS_ARRAY_SOLVE[LETRA_INDEX] = OPCION;
						//System.out.println("si se puede"); 
					}
					LETRA_INDEX++;
				}
			}
			else if (Arrays.binarySearch(LETRAS_ARRAY_SOLVE, OPCION) >= 0){
				System.out.println("No OTRA VEZ");
			}
			else{
				CONTAR++; 
			}
			
			System.out.println(Arrays.toString(LETRAS_ARRAY_SOLVE));
		}
	}
}
