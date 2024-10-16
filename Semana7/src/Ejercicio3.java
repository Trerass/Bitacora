import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		//Inicializar los arreglos
		
		System.out.println("Ingrese el tamaño de los arreglos: ");
		int n=sc.nextInt();
		int []arr1=new int [n];
		int []arr2=new int[n];
		
		//Ingresar los datos del arreglo 1
		
		System.out.println("Ingrese los datos del arreglo: ");
		
		for(int i=0;i<arr1.length;i++) {
		int num=sc.nextInt();
		arr1[i]=num;
		}
		
		//Mostrarlo por consola el arreglo 1
		
		System.out.println("El arreglo 1 sería: ");
		for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+"|");
		 	}
		
		System.out.println("");
		System.out.println("");

		
		//Invertir el arreglo 1 y mostrarlo en la consola
		
		System.out.println("El arreglo 2 sería: ");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr1[n-1-i];
			System.out.print(arr2[i]+"|");
		 	}
		}
}
