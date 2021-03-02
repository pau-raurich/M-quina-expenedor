import java.util.Scanner;

public class Diners {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//EXEMPLE
		double producte=2;
		
		/*
		 * Matriu on es guarda els diners introduits per l'usuari 
		 * Aquesta Matriu cada cop que es demani un producte es quedara a 0
		 * */
		double [] preu= new double [12];
		/*
		 * Aqui es guarda l'estock dels diners que hi ha per a canvi
		 * Es restara quan es doni diners a l'usuari
		 * */
		double [] dinersCanvi= {};
		/*
		 * Diners guanyats per el producte 
		 * */
		double [] dinersGuanyats= {};

		int contador = 0;
		
		 for(int i=contador; i<producte; i++ ) {
			 System.out.println("Introdueix les monedes: ");
			 preu[i] = sc.nextDouble();
			 contador += (int) (preu[i]);
			 System.out.println(contador);
	      }
		 
		}
}
