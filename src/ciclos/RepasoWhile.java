package ciclos;

import java.util.Scanner;

public class RepasoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("ingresa numero del 1 al 10: ");
		int num = sc.nextInt();
		while (num < 1 || num > 10) {
			System.out.println("el numero no es el requerido");
			System.out.println("ingresa un numero de 1 al 10: ");
			num =  sc.nextInt();			
		}
 System.out.printf("el numero ingresado fue: %d \n ", num);
	}
	
	// solo ejecuta el de arriba .
	/*
	public static void wilePass(String[] args) {
	 Scanner nt = new Scanner(System.in);
	  System.out.println("ingrese password: ");	  
	  String password = nt.nextLine();
	  
	  while(password.compareTo("password")!=0) {
		  System.out.printf("el password es incorrecto \n ", password);
		  System.out.println("ingrese password nuevaente: \n ");
		  password = nt.nextLine();
		    }
		System.out.println("el password es correctin: \n ");
		
	} */

}