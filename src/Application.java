import java.util.Scanner;

public class Application {

	public static void main(String [] args){

		//Matriu taula 
		String [][]taulastock = new String[4][3];

		//Matriu de l'stock
		int [][]productesrestants = new int[4][3];

		//Matriu on hi ha els preus de cada producte
		double [][]preusparticulars = new double[4][3];

		//Funcio on es veu el contingut de la maquina
		Stock.contingutmaquina(taulastock);
		//Funcio on es veu l'estructura de la maquina on es mostrara el contingut si la cridas
		Stock.estructuratauler(taulastock);
		//Funcio on es gurada l'stock que ens queda de cada producta
		Stock.productesstock(productesrestants);
		//Funcio on es guarda el preu de cada producte
		Stock.preus(preusparticulars);

		boolean torna = false;

		while(!torna)
		{
			//Aqui es guarda la posicio que ha dit l'usuari
			int posicio[] = Stock.demanarproducte(taulastock);
			if (posicio[1] == 1)
			{
				System.out.println("MANTENIMENT ");
			}

			if(Stock.hihastock(productesrestants, posicio))
			{
				
				if(!torna)
				{
					Stock.restastock(productesrestants, posicio);
					Stock.estructuratauler(taulastock);
					System.out.println();
					//Aqui es guarda el preu del producte seleccionat
					double preu = Stock.preuproducte(preusparticulars, posicio);
					System.out.println("El producte seleccionat costa: " + preu);
					System.out.println("Es poden posar monedes de 2, 1, 0,50 ");
					Diners.funcioMonedesPrincipal(preu);
				} 
		 
			}
			else//Aqui entrem en el cas de que no quedi stock d'algun producte
			{
				System.out.println("No queda stock del producte que has seleccionat trien un altre");
				torna = false; 
			}
		}  

	}
}
