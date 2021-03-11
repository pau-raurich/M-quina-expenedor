import java.util.Scanner;

public class Manteniment {
	
	public static void posarstock(int[][] productesrestants)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Selecciona la casella que vols omplir? ");
        String omplircasella=sc.nextLine();
        int[] posicio = new int[2];

        posicio[0] = omplircasella.charAt(0)-'A';
        posicio[1] = omplircasella.charAt(1)-'1';

        int fila = posicio[0];
        int columna = posicio[1];

        //
        System.out.println("Quan de stock vols omplir? ");
        int stocknou=sc.nextInt();
        System.out.println(productesrestants[fila][columna] + stocknou);
    }
	
	
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
			
			case 2: posarstock(productesrestants); 

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

