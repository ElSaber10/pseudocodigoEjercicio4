import java.util.*;
import java.util.Random;
public class Ejercicio4 {
	public static void main(String[] args){
	int datos[] = new int [21] ;
	int temporal;
	for(int i = 0; i < 20; i++){
	System.out.println("Ingrese su edad " + ( i+1 ) + ")");
	Scanner sc = new Scanner(System.in);
	datos[i] = sc.nextInt();
	}
	for (int i = 0;i < 20; i++){
		for (int j = 0; j< 20-1; j++){
			if (datos[j] < datos[j+1]){ // Ordena el array de mayor a menor, cambiar el "<" a ">" para ordenar de menor a mayor
			temporal = datos[j]; 
			datos[j] = datos[j+1]; 
			datos[j+1] = temporal;
			}
		}
	}
	System.out.println("Posicion mayor " + datos[0]);
}
}
