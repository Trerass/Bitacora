import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el tamaño de la matriz: ");
		int n=sc.nextInt();
		int [][]matriz=new int[n][n];
		int c=1;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j]=c++;
			 	}
		 	}
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+"|");
			 	}
			System.out.println();
		 	}
		}

}
