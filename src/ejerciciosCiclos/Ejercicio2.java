package ejerciciosCiclos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0 ;
		int suma = 0;
		while(i<n) {
			
			i+=1;
			if(i%2==0) { //significa que i se divide en 2 es igual a 0 y es par.
				suma+=i;
				System.out.println("sumando" + " " + i); // imprime los valores que se estan sumando de dos en dos
				}
			}
System.out.println(suma); // imprime el total 2550
	}

}
