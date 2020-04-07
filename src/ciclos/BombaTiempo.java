package ciclos;

import java.util.concurrent.TimeUnit;

public class BombaTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5;
		while (i>0) {
			System.out.println(i);
			i-=1;
			try {
				TimeUnit.SECONDS.sleep(1);				
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		
		
		
		
	}

}
