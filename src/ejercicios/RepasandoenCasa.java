package ejercicios;

import java.util.Scanner;

public class RepasandoenCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		// System.out.println("elija una opcion \n");
		 // String option = scan.nextLine();
		
		String option = "";
			
		
		while (!option.equals("salir")) {
			System.out.println("pres 1 para accion 1 \n");
			
			System.out.println("pres 2 para accion 2 \n");
			
			System.out.println("escribe salir para terminar \n\n");
			
			System.out.println("ingrese uuna opcion: ");			
		
		 option = scan.nextLine();
		 
		 if (option.equals("1")) {
			 System.out.println("Realizando accion 1 \n");	
				 }
		 else if (option.equals("2")) {
			 System.out.println("Realizando accion 2 \n");			
			 
		 }
		 else if (option.equals("salir")) {
			 System.out.println("Saliendo...");	
			
		 }
		 else {
			 System.out.println("opcion invalida");		
			 
		 }
		 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.printf("ingrese un numero entre 1 y 10:");
		num = sc.nextInt();
		}while(num <1 || num > 10);
		System.out.printf("El número ingresado es: %d\n",num);

	}
*/

		
		
		
		
		
}
}