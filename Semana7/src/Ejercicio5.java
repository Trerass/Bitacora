import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el tamaño del arreglo: ");
		int n=sc.nextInt();
		int []arr1=new int[n];
		System.out.println("Ingrese datos para para el arreglo: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"|");
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("Su forma inversa sería: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[n-1-i]+"|");
		}
	}

}
