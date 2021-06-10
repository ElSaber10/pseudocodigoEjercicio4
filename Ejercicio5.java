import java.util.*;
import java.util.Random;
public class Ejercicio5 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);
	//String sexo;
	int n,MenoresHombres = 0, MayoresMujeres = 0, i = 0;
	int datos[] = new int [100] ;
	System.out.println("Ingrese el numero de personas");
	n = sc.nextInt();
	while(i < n){
	System.out.println("Ingrese su sexo F o M ");
	String sexo = scan.nextLine();
		if (sexo.equals("F") || sexo.equals("f")){
		System.out.println("Mujer Ingrese su edad " + ( i+1 ) + ")");
		datos[i] = sc.nextInt();
			if (datos[i] > 18){
			MayoresMujeres++;
			}
		i++;
		}
		if (sexo.equals("M") || sexo.equals("m")){
		System.out.println("Hombre Ingrese su edad " + ( i+1 ) + ")");
		datos[i] = sc.nextInt();
			if (datos[i] < 18){
			MenoresHombres++;
			}
		i++;
		}
	}
	System.out.println("Dato de Mujeres mayores " + MayoresMujeres);
	System.out.println("Dato de Hombres Menores " + MenoresHombres);
}
}
