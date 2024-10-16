import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String n=sc.nextLine();
		if(n.length()%2==0) {
			String m= "" + n.charAt(0) + n.charAt(n.length()-1);
			System.out.println(m);
		}else {
			String x="" +n.charAt(0)+ n.charAt(n.length()/2)+n.charAt(n.length()-1);
			System.out.println(x);
		}
	}

}
