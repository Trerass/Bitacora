import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba una frase: ");
		String n=sc.nextLine();
		int ca=0;
		System.out.println("Ingrese la letra que quiere buscar: ");
		char b=sc.next().charAt(0);
		
		for (int i=0;i<n.length();i++) {
			if(n.charAt(i)== b) {
				ca++;
			}
		}
		System.out.println("El total de letras "+b+" de la frase es: "+ca);

	}

}
