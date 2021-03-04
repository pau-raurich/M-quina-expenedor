import java.util.Scanner;

public class Application {

	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		char[][] stock = new char[3][4];//creem una matriu per veure el stock
		
		int n = 0;
		/*
		 * 
		 * Presentacio de la maquina
		 * 
		 * */
		
		//Funcio mostreTaulell
		
		/*
		 * Es fa fins que no queden productes
		 * */
		while(n<5)//while per cridar a les diferents funcions dels altres fitxers
		{
			
			//Opcio codiManteniment
				//Opcio posarStok
				//Opcio posarMonedes
				//Opcio retirdaMonedes
				//Opcio mirarStock
			//Opcio codiSenseCanvi
			//Opcio codiNoral
			estructuratauler(stock);
			contingutmaquina(stock);
			
			
			
		}

	}
}
