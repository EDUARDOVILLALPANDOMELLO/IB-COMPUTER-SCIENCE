import java.util.*;
public class pilas {
	public static String[] PILA_ARRAY = new String[9];
	public static int LastFull = 0;
	
	public static void lastFullFn(){
		boolean isIndexFull = true;
                int lastFullIndex = 0;
                for(int i=0; i<9; i++){
                        if(PILA_ARRAY[i] != null){
                                lastFullIndex = i;
                        }
                }
                LastFull = lastFullIndex;
	}
	
	public static void main(String[] args){
		menu();
	}
	public static void menu(){
		Scanner TECLADO = new Scanner(System.in);
		System.out.println( Arrays.toString(PILA_ARRAY) );
		System.out.println(""); 
		System.out.println("¿ESTA VACIO? " + isEmpty());
		System.out.println("¿ESTA LLENO?" + isFull()); 
		System.out.println();
		System.out.println("[1] AÑADIR ELEMENTO \t [2] ELIMINAR ELEMENTO \t [3] MOSTRAR ÚLTIMO ELEMENTO");
		int OPCION = TECLADO.nextInt();
		switch(OPCION){
			case 1:
				System.out.println("INGRESE LO QUE DESEE AÑADIR");
				System.out.println(""); 
				String nuevoElemento = TECLADO.next();
				f_push(nuevoElemento);
				System.out.println("SE AGREGÓ UN ELEMENTO");
				lastFullFn();
				break;
			case 2:
				f_pop();
				System.out.println("SE ELIMINÓ UN ELEMENTO");
				lastFullFn();
				break;
			case 3:
				System.out.println("EL ÚLTIMO ELEMENTO ES " + f_top());
				break;
			default: 
				menu();
				break;
		}
		System.out.println("");
		System.out.println(lastFull()); 
		menu(); 
	}

	public static boolean isEmpty(){
		boolean isIndexEmpty = false;
		for(int i=0; i<9; i++){
			if(PILA_ARRAY[i] == null){
				isIndexEmpty = true;
			}
		}
		return isIndexEmpty;
	}
	public static boolean isFull(){
		boolean isIndexFull = false;
		for(int i=0; i<9; i++){
			if(PILA_ARRAY[i] != null){
				isIndexFull = true;
			}
		}
		return isIndexFull;
	}

	public static int Size(){
		int indexSum = 0;
		for(int i=0; i<9; i++){
			if(PILA_ARRAY[i] != ""){
				indexSum++; 
			}
		}
		return indexSum;
	}
	public static int maxSize(){
		return PILA_ARRAY.length;
	}
	public static int lastFull(){
		boolean isIndexFull = true;
		int lastFullIndex = 0;
		for(int i=0; i<9; i++){
			if(PILA_ARRAY[i] != null){
				lastFullIndex = i;
			}
		}
		return lastFullIndex;
	}


	public static void f_push(String newValue){
		if(!isFull()){
			PILA_ARRAY[lastFull()] = newValue;
		}
	}
	public static void f_pop(){
		if(!isEmpty() ){
			PILA_ARRAY[lastFull()] = null;
		}
	}
	public static String f_top(){
		return PILA_ARRAY[lastFull() ]; 
	}
}
