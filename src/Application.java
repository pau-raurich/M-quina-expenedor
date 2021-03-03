import java.util.Scanner;

public class Application {

	
	
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		char[][] stock = new String[3][4];//creem una matriu per veure el stock
		
		int n = 0;
		
		while(n<5)//while per cridar a les diferents funcions dels altres fitxers
		{
			estructuratauler(stock);
			contingutmaquina(stock);
		}

	}
}
