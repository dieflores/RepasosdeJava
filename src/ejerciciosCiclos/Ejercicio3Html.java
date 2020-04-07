package ejerciciosCiclos;

import java.util.Scanner;

public class Ejercicio3Html {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String html = "<ul>\n"; // agregado sedundo paso "<ul>"... en el primer paso el String solo era ""
		Scanner scan = new Scanner(System.in);
		int items = scan.nextInt();
		int i =0;
		
		while (i<items) {
			i+=1;
			html+= "\t<li> item " + i + " </li>\n"; // "\t" agregado 3er paso para tabulaciòn sangria
			}
		html+= "</ul>\n"; // agregado segundo paso para agregar "</ul>" al final y "\n" para salto de linea
System.out.println(html);
	}

}
