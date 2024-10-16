import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa el tamaño de la matriz: ");
		int n=sc.nextInt();
		int [][]matriz1=new int [n][n];
		int [][]matriz2=new int [n][n];
		int c=1;
		Random random=new Random();
		
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1.length;j++) {
				matriz1[i][j]=random.nextInt(100);
			}
		}
		for(int i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2.length;j++) {
					matriz2[j][i]=matriz1[i][j];
			}
		}
		System.out.println("La matriz 1 es: ");
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1.length;j++) {
				System.out.print(matriz1[i][j]+"|");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("La matriz 2 es: ");
		
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1.length;j++) {
				System.out.print(matriz2[i][j]+"|");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("La diagonal de la matriz 2 es: ");
		
        for(int i=0;i<matriz2.length;i++) {
        	for(int j=0;j<matriz2.length;j++) {
        		if(i==j) {
        			matriz2[i][j]=matriz1[i][j];
        		}if(i!=j) {
        			matriz2[i][j]=0;
        		}
        	System.out.print(matriz2[i][j]+"|");
        	}
        	System.out.println();
         }
	}
}

