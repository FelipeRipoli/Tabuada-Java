
public class tabuada {
	public static void main(String[]args) {
		//poderia ter declarado o int i, j fora do for, caso quisesse.
		for(int i=1; i<=10; i++) {
			System.out.println("\nTabuada do n�mero" + i);
			
			for(int j=0; j<=10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}
}
