import java.util.Scanner;
public class piramide{
	public static void main(String[] args){
		Scanner TECLADO = new Scanner(System.in);
		int ALTURA = TECLADO.nextInt();
		int LINEA = 0;
		String STRINGONE = "";
		for(int i=0; i < ALTURA; i++){
			LINEA++;
			STRINGONE = STRINGONE.concat("*");
			System.out.printf(LINEA + " ::: ");
			System.out.println(STRINGONE);
		}
		for(int i=1; i < ALTURA; i++){
			int iaa = 0;
			LINEA++;
			String STRINGTWO = "";
			while(iaa < (ALTURA-i)){
				iaa++;
				STRINGTWO = STRINGTWO.concat("*");
				//iaa++;
			}
			System.out.printf(LINEA + " ::: "); 
			System.out.println(STRINGTWO);
		}
	}
}
