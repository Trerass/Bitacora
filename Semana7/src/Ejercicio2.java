import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int n=10;
		int []arr1= {1,2,3,4,5,6,7,8,9,10};
		int []arr2=new int[n];
		

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
