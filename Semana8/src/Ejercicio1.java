
public class Ejercicio1 {

	public static void main(String[] args) {
		int [][] matriz=new int[3][3];
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
