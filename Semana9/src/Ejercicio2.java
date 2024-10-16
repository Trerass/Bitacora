import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("hola mundo");
		String n="hola mundo";
		for(int i=0;i<n.length();i++) {
			System.out.print(n.charAt(n.length()-1-i));
		}
	}

}
