import java.util.*;
public class Ejercicio0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba una frase: ");
		String n=sc.nextLine();
		System.out.println("Escriba otra frase: ");
		String m=sc.nextLine();
		if(n.equals(m)) {
			System.out.println("Las frases son iguales");
		}else {
			System.out.println("Las frases son diferentes");
		}
	}

}
