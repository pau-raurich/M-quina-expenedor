import java.util.Scanner;
public class Stock {

    //Estructura de la taula

    public static void estructuratauler (String[][] taulastock)
    {

        for (int i =0; i<taulastock.length;i++)
        {
            System.out.println();
            System.out.print(" ");
            for(int j =0; j<taulastock[0].length;j++)
            {
                System.out.print(" " + taulastock[i][j]);
            }
        }
    }

    //Posicio dels productes
    //Cridem el contingut de la maquina

    public static void contingutmaquina(String[][] taulastock)
    {
        taulastock[0][0]="A1";
        taulastock[0][1]="A2";
        taulastock[0][2]="A3";

        taulastock[1][0]="B1";
        taulastock[1][1]="B2";
        taulastock[1][2]="B3";

        taulastock[2][0]="C1";
        taulastock[2][1]="C2";
        taulastock[2][2]="C3";

        taulastock[3][0]="D1";
        taulastock[3][1]="D2";
        taulastock[3][2]="D3";

    }

    public static void productesrestants (int[][] productesrestants)
    {
        productesrestants[0][0]= 10;
        productesrestants[0][1]= 10;
        productesrestants[0][2]= 10;

        productesrestants[1][0]= 10;
        productesrestants[1][1]= 10;
        productesrestants[1][2]= 10;

        productesrestants[2][0]= 10;
        productesrestants[2][1]= 10;
        productesrestants[2][2]= 10;

        productesrestants[3][0]= 10;
        productesrestants[3][1]= 10;
        productesrestants[3][2]= 10;

    }

    //Funcio a on demanarem al client quin producte vol
    public static int[] demanarproducte (String[][] taulastock){

        int []posicio = new int[2];
        Scanner lector = new Scanner (System.in);
        System.out.println();
        System.out.println();
        System.out.print("Posa el numero del producte que vols comprar: ");
        String producte = lector.nextLine();
        posicio[0] = producte.charAt(0)-'A';
        posicio[1] = producte.charAt(1)-'1';

        return posicio;

    }

    public static boolean hihastock (String[][] taulastock, int[][] productesrestants){
    
       passaranumeros(producte);

       boolean hihastock = false;
       if(0){

       }
       return 

    
    }


   public static void main(String [] args){

    String [][]taulastock = new String[4][3];
    int [][]productesrestants = new int[4][3];
    contingutmaquina(taulastock);
    estructuratauler(taulastock);
   String producte = demanarproducte(taulastock);
   System.out.print(producte);
    
    }
}
