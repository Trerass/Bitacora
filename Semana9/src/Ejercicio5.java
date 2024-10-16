import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String n=sc.nextLine();
		for(int i=0;i<n.length();i++) {
			System.out.print(n.charAt(n.length()-1-i));
		}
	}

}
