import java.util.Scanner;

public class Diners {

	public static int monaderGuanyat [] = new int [3];
	public static int monaderCanvi [] = {5,5,5};


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
			if(monedaIntroduida==1||monedaIntroduida==2||monedaIntroduida==0.50){
				/*-------------------------------------------*/
				introduirMonedes(monedaIntroduida);
				/*-------------------------------------------*/

				//Et suma les monedes introduides
				contador += monedaIntroduida;

				if(preuProducte>contador) {//Si es > continua el bucle

				}else if(preuProducte==contador) {//Si es == sacaba el codi
					System.out.println("Import finalitzat");
					System.out.println("Ja pot recollir el producte");
					break;//Un cop entrem aquest if aixo et fa sortir del bucle

				}else {//Sino et tornen el canvi i el producte
					canviDonat = contador - preuProducte;//veure la diferencia que li hem de donar
					/*-------------------------------------------*/
					retiradaMoneda(canviDonat);
					/*-------------------------------------------*/
					System.out.println("Import finalitzat");
					System.out.println("Tingui el seu canvi "+canviDonat+": ");
					System.out.println("Ja pot recollir el producte");
				}
			}else {
				System.out.println("Introdueix la moneda correcte.");

			}
		}
	}
	/*------------------------------------------------------------------------------*/
	public static void introduirMonedes(double monedaIntroduida) {
		if (monedaIntroduida == 1) {
			monaderGuanyat[0]=monaderGuanyat[0]+1;
			//System.out.println(monaderGuanyat[0]);
		}else if (monedaIntroduida == 2) {
			monaderGuanyat[1]=monaderGuanyat[1]+1;
			//System.out.println(monaderGuanyat[1]);

		}else {
			monaderGuanyat[2]=monaderGuanyat[2]+1;
			//System.out.println(monaderGuanyat[2]);
		}		
	}
	
	/*------------------------------------------------------------------------------*/
	public static void retiradaMoneda(double canviDonat) {
		/*
		 * He de fer una funcio que comprovi si queden monedes
		 * He de fer funcio que resti totes les monedes be
		 * */
		long euros= (long) canviDonat;//Agafem la part entera del numero (els euros)
		double centims = canviDonat-euros;//Restem els euros amb el canviDonat (els centims)
		
		if (euros == 1) {
			if(quedaCanvi1()==false) {
				System.out.println("No queda canvi");
			}else {
			monaderCanvi[0]=monaderCanvi[0]-1;
			//System.out.println(monaderCanvi[0]);
			System.out.println("S'ha tornat una moneda de: "+euros+"€");
			}
		}if (euros == 2) {
			if(quedaCanvi2()==false) {
				System.out.println("No queda canvi");
			}else {
			monaderCanvi[1]=monaderCanvi[1]-1;
			//System.out.println(monaderCanvi[1]);
			System.out.println("S'ha tornat una moneda de: "+euros+"€");
			}
		}if(centims == 0.50) {
			if(quedaCanvi50()==false) {
				System.out.println("No queda canvi");
			}else {
				monaderCanvi[2]=monaderCanvi[2]-1;
			//System.out.println(monaderCanvi[2]);
			System.out.println("S'ha tornat una moneda de: "+centims+"0€");
			}
		}		
	}
	/*------------------------------------------------------------------------------*/

	/*
	 * Mirar si queda canvi de monedeS
	 */
	public static boolean quedaCanvi1() {
		boolean si;
		
		if(monaderCanvi[0]==0) {
			return si = false;//Si no queda canvi torna false
		}else {
			return si = true;//Si queda cani torna true
		}
	}
	public static boolean quedaCanvi2() {
		boolean si;
		
		if(monaderCanvi[1]==0) {
			return si = false;//Si no queda canvi torna false
		}else {
			return si = true;//Si queda cani torna true
		}
	}
	public static boolean quedaCanvi50() {
		boolean si;
		
		if(monaderCanvi[2]==0) {
			return si = false;//Si no queda canvi torna false
		}else {
			return si = true;//Si queda cani torna true
		}
	}
	/*------------------------------------------------------------------------------*/

	/*Aquestes funcions retornen la quantitat de monedes que s'han guanyat*/
	public static int consultarMonedes1e() {
		return monaderGuanyat[0];//Monedes 1€
	}
	public static int consultarMonedes2e() {
		return monaderGuanyat[1];//Monedes 2€
	}
	public static int consultarMonedes50cnt() {
		return monaderGuanyat[2];//Monedes 0,50€
	}
	
	/*Aquestes funcions retornen la quantitat de monedes que queden en el Canvi*/
	public static int consultarMonedesCanvi1e() {
		return monaderCanvi[0];//Monedes 1€
	}
	public static int consultarMonedesCanvi2e() {
		return monaderCanvi[1];//Monedes 2€
	}
	public static int consultarMonedesCanvi50cnt() {
		return monaderCanvi[2];//Monedes 0,50€
	}
	/*---------------------------------------------------------------------------*/

	public static void main(String[] args) {
		int n=0;
		double preuProducte= 1.5;

		//int monader [] = new int [3];

		while(n<5) {
			funcioMonedesPrincipal(preuProducte);
			//System.out.print(" ");
			
			/*
			 * Prova per veure si el sortia be
			 * */
			System.out.println("Monedes d'1€: "+consultarMonedes1e());
			System.out.println("Monedes de 2€: "+consultarMonedes2e());
			System.out.println("Monedes de 0.50€: "+consultarMonedes50cnt());
			System.out.println("----------------------------------------------");
			System.out.println("Monedes d'1€: "+consultarMonedesCanvi1e());
			System.out.println("Monedes de 2€: "+consultarMonedesCanvi2e());
			System.out.println("Monedes de 0.50€: "+consultarMonedesCanvi50cnt());


		}

	}
}