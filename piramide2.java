import java.util.Scanner;
public class piramide2{
	public static void main(String[] args){
		Scanner TECLADO = new Scanner(System.in);
		System.out.println("INGRESE UN VALOR");
		int TRIANGULO = TECLADO.nextInt();
		int CONTAR = 1;
		int CONTARREVERSA = 0;
		String LINEA = "";
		while(CONTAR <= TRIANGULO){
			CONTAR++;
			LINEA = LINEA+"*";
			System.out.println(LINEA);
		}
		while(CONTARREVERSA < TRIANGULO){
			CONTARREVERSA++;
			int DIFERENCIA = TRIANGULO - CONTARREVERSA;
			int NUMAST = 0;
			String LINEAREVERSA = "";
			while(NUMAST<DIFERENCIA){
				NUMAST++;
				LINEAREVERSA = LINEAREVERSA + "*";
			}
			System.out.println(LINEAREVERSA);
		}
	}
}
