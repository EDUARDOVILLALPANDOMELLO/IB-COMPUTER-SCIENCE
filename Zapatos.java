
import java.util.*;
public class Zapatos {
	public static void main(String args[]){
 		int[] ZapatosArr = new int[20];
		int MaxIndex = 0;
		int MinIndex = 0;
		int VaciosCont = 0;
		Scanner TECLADO = new Scanner(System.in);
		for(int i=0; i<ZapatosArr.length; i++){
				System.out.println("["+i+"] ¿Cuántos zapatos hay?");
				int numeroZapatos = TECLADO.nextInt();
				ZapatosArr[i]=numeroZapatos;
		 		System.out.println(MaxIndex); 

			if(ZapatosArr[i]>ZapatosArr[MaxIndex]){
				MaxIndex = i;
			}
			if(ZapatosArr[i]<ZapatosArr[MaxIndex]){
				MinIndex = i;
			}
			if(ZapatosArr[i] == 0){
				VaciosCont++;
			}
		}
		System.out.println(Arrays.toString(ZapatosArr)); 
		System.out.println("MAX "+ZapatosArr[MaxIndex] + " en Locker " + MaxIndex);
		System.out.println("MIN "+ZapatosArr[MinIndex] + " en Locker " + MinIndex); 
		System.out.println("Lockers vacíos " + VaciosCont); 
		 
	}
}
