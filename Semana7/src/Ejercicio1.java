import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Tamaño del arreglo
		
		System.out.println("Ingrese el tamaño del arreglo: ");
		int x=sc.nextInt();
		int [] arr= new int[x];
		System.out.println("Ingrese datos al arreglo: ");
		
		//ciclo para poder poner datos dentro del arreglo
		
		for(int i=0; i<arr.length;i++) {
			int num=sc.nextInt();
			arr[i]=num*2;
		}
		
		//lo que se mostrará en la consola
		
		System.out.println("Valores del arreglo: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"|");
		}
		
		System.out.println("");
		
		System.out.println("Valores de los datos multiplicados x 3: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]*3+"|");
		}
	}

}
