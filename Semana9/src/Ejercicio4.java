
public class Ejercicio4 {

	public static void main(String[] args) {
		String str1="Esta es una prueba de string, que verifica donde esta un string".toLowerCase();
		String str2="esta".toLowerCase();
		String str3="string".toLowerCase();
		
		System.out.println("Posiciones de '" + str2 + "' : ");
        findPositions(str1,str2);

       
        System.out.println("Posiciones de '" + str3 + "' : ");
        findPositions(str1,str3);
    }

    public static void findPositions(String str1, String str2) {
        int index=str1.indexOf(str2);
        while (index>=0){
            System.out.println(index);
            index = str1.indexOf(str2,index+1);
        }
    }
}
