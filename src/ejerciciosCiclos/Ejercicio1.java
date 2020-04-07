package ejerciciosCiclos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese numero para sumatoria");
		Scanner cnt = new Scanner(System.in);
		int n = cnt.nextInt();
		int i = 0;
		int suma = 0;
		
		while (i<n) {
			System.out.println("sumando" + " " + i);
			i+=1;
			suma +=i; 
			}
		System.out.println("total=" + " " + suma);
			
	}

}

