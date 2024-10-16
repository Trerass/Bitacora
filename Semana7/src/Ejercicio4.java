import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del arreglo: ");
		int n=sc.nextInt();
		while(n%2!=0) {
			System.out.println("El tamaño del arreglo debe ser par, vuelva a ingresar un valor: ");
			n=sc.nextInt();
		 	}
		int []arr1=new int[n];
		float []arr2=new float[n/2];
		
		System.out.println("Ingrese los valores del arreglo: ");
		
		for(int i=0;i<arr1.length;i++) {
			int num=sc.nextInt();
			arr1[i]=num;
		 	}
		
		for(int i=0;i<arr2.length;i++) {	
			arr2[i]=(float)(arr1[2*i]+arr1[2*i+1])/2;
			 	}
		System.out.println("El arreglo 1 sería: ");
		
		for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+"|");
		 	}
		
		System.out.println("");
		System.out.println("");

		
		System.out.println("El arreglo 2 sería: ");
		
		for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[j]+"|");
		 	}
	 	}
	
}
