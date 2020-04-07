package ejerciciosFor;

public class ejemplosFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		// ejemplo de Productorias (en ves de sumar, multiplican) producto = 1; nunca empezar de 0 
		
		int producto = 1;
		int i;
		for (i=1;i<=10;i++){
			producto *=i;
		}System.out.println(producto);
		 
		
		
		
		
		
		/* sumatoria desde 5 hasta 100
		int suma = 0;
		int i;
		for(i=5;i<=100;i++){
		suma+=i;
		}
		System.out.print(suma);
		
		
		/* Sumatoria desde 3 multiplicado por dos (2Xi)
		int suma=0;
		int i;
		 for(i=3;i<=9;i++) {
			 suma+=2*i;			 
		 }System.out.println(suma);
				
		
		/* ejemplo de for con sumatoria desde cinco hasta 10 = 45
		int suma = 0;
		int i;
		for(i=5;i<=10;i++){
			suma +=i;			
		} System.out.print(suma);
		
		
		
		
		/*  ejemplo de for de dos en dos desde dos.	
		int i;
		int suma;
		
		for(i=2;i<=100;i+=2) { // de dos en dos  , para uno en uno (i=0;i<=100;i++)
			System.out.println("iterando " + i);
			
			}		
		
		 ejemplo de For con i y j 
		Scanner skn = new Scanner(System.in);
		int i,j= skn.nextInt();
		
		for(i=5, j=1; i<10 ;i++, j=j*(i/2)) {
			
			System.out.println("i" + i + "j" + j); */
		}
		
	}

