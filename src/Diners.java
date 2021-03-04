import java.util.Scanner;

public class Diners {
	
	int monader [] = new int [3];


	public static void funcioMonedesPrincipal (double preuProducte){
		/*
		 * Variable la cual es guardara el canvi tornat
		 */
		double canviDonat=0;
		/*
		 * Aqui guardarem el valor itroduit per el client
		 */
		double monedaIntroduida = 0.0;
		/*
		 * Utilitzem aquesta variable per sumar la cada cop
		 * les monedes que introdueix el client,
		 * anteriorment guardades en el preu
		 */
		double contador = 0.0; 

		while(preuProducte >= contador) {
			Scanner sc = new Scanner(System.in);

			/*
			 * Bucle que es fa fins que el cost del producte 
			 * es mes gran o igua a les monedes introduides per el client
			 */

			System.out.println("Introdueix les monedes: ");
			monedaIntroduida = sc.nextDouble();
			stockMonedesGuanyades(monedaIntroduida);
			
			//Et suma les monedes introduides
			contador += monedaIntroduida;
			
			if(preuProducte>contador) {//Si es > continua el bucle

			}else if(preuProducte==contador) {//Si es == sacaba el codi
				System.out.println("Import finalitzat");
				System.out.println("Ja pot recollir el producte");
				break;//Un cop entrem aquest if aixo et fa sortir del bucle

			}else {//Sino et tornen el canvi i el producte
				canviDonat = contador - preuProducte;//veure la diferencia que li hem de donar
				stockMonedesCanvi(canviDonat);
				System.out.println("Import finalitzat");
				System.out.println("Tingui el seu canvi "+canviDonat+": ");
				System.out.println("Ja pot recollir el producte");
			}
		}

	}

	public static void stockMonedesCanvi (double canviDonat){
		/*
		 * Aqui es guarda l'estock dels diners que hi ha per a canvi
		 * Es restara quan es doni diners a l'usuari
		 * */
		int monedes1e = 50;
		int monedes2e = 50;
		int monedes50cnt = 50;
		/*
		 * Resta les monedes de canvi per el client 
		 */
		if (canviDonat == 1) {
			monedes1e -= 1;
			System.out.println(monedes1e);
		}else if (canviDonat == 2) {
			monedes2e -= 1;
			System.out.println(monedes2e);

		}else {
			monedes50cnt -= 1;
			System.out.println(monedes50cnt);
		}
	}
	
	public static void stockMonedesGuanyades ( double monedaIntroduida){
		/*
		 * Aqui es guarda l'estock dels diners que hi ha per a canvi
		 * Es restara quan es doni diners del client
		 * Posicio 0 == Monedes 1€
		 * Posicio 1 == Monedes 2€
		 * Posicio 2 == Monedes 0.50€
		 */
		int monaderGuanyat [] = new int [3];
		/*
		 * Sumar les monedes introduides per el client 
		 */
		if (monedaIntroduida == 1) {
			monaderGuanyat[0] = +1;
			System.out.println(monaderGuanyat[0]);
		}else if (monedaIntroduida == 2) {
			monaderGuanyat[1] += 1;
			System.out.println(monaderGuanyat[1]);

		}else {
			monaderGuanyat[2] += 1;
			System.out.println(monaderGuanyat[2]);
		}
	}
	
	
	public static void stockMonedes (double monedaCanvi){
	


	}


	public static void main(String[] args) {
		int n=0;
		 double preuProducte= 2.5;
		 
		int monader [] = new int [3];
		 
		 while(n<5) {
		funcioMonedesPrincipal(preuProducte);
		System.out.println(" ");

		 }

	}
}