import java.util.*;
public class Ejercicio3 {

	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String n=sc.nextLine();
		System.out.println("Ingrese otra frase: ");
		String m=sc.nextLine();
		boolean substring = n.contains(m);
		
		System.out.println("¿El string 2 es substring del 1?: "+substring);
	}

}
