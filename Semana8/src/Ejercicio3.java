import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de filas de la matriz: ");
		int n=sc.nextInt();
		System.out.println("Ingrese la cantidad de columnas de la matriz: ");
		int m=sc.nextInt();
		int [][] matriz=new int [n][m];
		Random random=new Random();
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j]=random.nextInt(11);
			}
		}
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+"|");
			}
			System.out.println();
		}
		//Ejercicio 3,2
		System.out.println("");
		int []arrSuma= new int[n];
        for(int i=0;i<n;i++) {
           int suma=0;
            for(int j=0;j<m;j++) {
                suma+=matriz[i][j];
            }
            arrSuma[i]=suma;
        }
        System.out.println("Arreglo suma de las filas: ");
        for (int i=0;i<n;i++) {
            System.out.println(arrSuma[i]+"|");
         	}
        System.out.println();
     	}
 }

