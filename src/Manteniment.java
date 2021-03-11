import java.util.Scanner;

public class Manteniment {
	
	
	public static void MantenimentMaquina(String[][] taulastock, int[][] productesrestants)
	{
		Scanner sc = new Scanner (System.in);
		int n = 0;
		while(n<5)
		{
			System.out.println("1-Mirar Stock Productes");
            System.out.println("2-Posar Stock Productes");
            System.out.println("3-Mirar Stock MonedesCanvi");
            System.out.println("4-Mirar Stock MonedesGuanyades");
            System.out.println("5-Retirar Stock MonedesGuanyades");
            System.out.println("6-Posar Stock MonedesCanvi");
            System.out.println("7-Sortir de Manteniment");
            System.out.println("8-Apagar Màquina");
            
            System.out.println("Introdueix un número ");
            
            int numero = sc.nextInt();

			switch(numero)
			{
			case 1: Stock.productesstock(productesrestants);
			
				break;
			
			case 2: 
				
				break;
			
			case 3:
				
				break;
				
			case 4:Diners.consultarMonedesGuanyades();

				
				break;
				
			case 5:Diners.retirarMonedesGuanyades();
				
				break;
				
			case 6:
				
				break;
				
			case 7:
				
				break;
				
			case 8:
				
				break;
		
			}
		}
		
	}
	

	/*public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
	}*/

}

