import java.util.Scanner;

public class Application {

	public static void main(String [] args){
	/*	Scanner sc = new Scanner (System.in);
		
		String[][] taulaStock = new String[4][3];//creem una matriu per veure el stock
		
		int n = 0;
		/*
		 * 
		 * Presentacio de la maquina
		 * 
		 * */
		//System.out.println("Benvinguts a la nostra m�quina expendedora, agafi el producte que vulgui");
		
		//Funcio mostreTaulell
		//estructuratauler(talerStock);
		/*
		 * Es fa fins que no queden productes
		 * */
		/*while(n<5)//while per cridar a les diferents funcions dels altres fitxers
		{
			
			//Opcio codiManteniment
				//Opcio posarStok
				//Opcio posarMonedes
				//Opcio retirdaMonedes
				//Opcio mirarStock
			//Opcio codiSenseCanvi
			//Opcio codiNoral
			contingutmaquina(taulerStock);
			
			
			
		}
		*/
				

		String [][]taulastock = new String[4][3];
		int [][]productesrestants = new int[4][3];
		double [][]preusparticulars = new double[4][3];
		Stock.contingutmaquina(taulastock);
		Stock.estructuratauler(taulastock);
		Stock.productesstock(productesrestants);
		Stock.preus(preusparticulars);
		boolean torna = false;
		while(!torna)
		{
	
			int posicio[] = Stock.demanarproducte(taulastock);
			if(Stock.hihastock(productesrestants, posicio))
			{
				
				if(!torna)
				{
					Stock.restastock(productesrestants, posicio);
					Stock.estructuratauler(taulastock);
					System.out.println();
					double preu = Stock.preuproducte(preusparticulars, posicio);
					System.out.println("El producte seleccionat costa: " + preu);
					Diners.funcioMonedesPrincipal(preu);
				} 
		 
			}
			else
			{
				System.out.println("No queda stock del producte que has seleccionat trien un altre");
				torna = false; 
			}
		}  

	}
}
