import java.util.Scanner;

public class Diners {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//EXEMPLE
		double producte=2.5;
		
		
		/*
		 * Matriu on es guarda els diners introduits per l'usuari 
		 * Aquesta Matriu cada cop que es demani un producte es quedara a 0
		 * */
		double monader [] = new double [3];
		/*
		 * Aqui es guarda l'estock dels diners que hi ha per a canvi
		 * Es restara quan es doni diners a l'usuari
		 * */
		int monedes1e = 50;
		int monedes2e = 50;
		double monedes50cnt = 50;

		/*
		 * Diners guanyats per el producte 
		 * */
		double [] dinersGuanyats= {};
		/*
		 * Aqui guardarem el valor itroduit per el client
		 * */
		double preu = 0.0;
		/*
		 * Utilitzem aquesta variable per sumar la cada cop
		 * les monedes que introdueix el client,
		 * anteriorment guardades en el preu
		 * */
		double contador = 0.0; 
		/*
		 * Variable la cual es guardara el canvi tornat
		 * */
		double canviDonat=0;
		/*-------------------------------------------------------------------------*/
		
		/*Bucle que es fa fins que el cost del producte 
		 * es mes gran o igua a les monedes introduides per el client
		 * */
		while(producte >= contador) {
            System.out.println("Introdueix les monedes: ");
            preu = sc.nextDouble();
            contador += preu;
            if(producte>contador) {

            }else if(producte==contador) {
                System.out.println("Import finalitzat");
                System.out.println("Ja pot recollir el producte");
                break;//Un cop entrem aquest if aixo et fa sortir del bucle

            }else {
                canviDonat = contador - producte;//veure la diferencia que li hem de donar
                System.out.println("Import finalitzat");
                System.out.println("Tingui el seu canvi "+canviDonat+": ");
                System.out.println("Ja pot recollir el producte");
            }
         }
		 
		}
}