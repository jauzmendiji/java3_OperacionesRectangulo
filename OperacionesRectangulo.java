import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * de las operaciones del circulo
 */
public class OperacionesRectangulo {

	public static void main (String args[]) {

		double base, altura, resultadoPeri, resultadoArea;
		Rectangulo rectangulo = new Rectangulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la base: ");
		base = sc.nextDouble();
		System.out.print("\ningresa la altura: ");
		altura = sc.nextDouble();		

		rectangulo.setBase(base);
		rectangulo.setAltura(altura);

		resultadoArea = rectangulo.area();
		resultadoPeri = rectangulo.peri();

		System.out.println("\nEl area es: " + resultadoArea);
		System.out.println("\nEl perimetro es: " + resultadoPeri);
	}
}
