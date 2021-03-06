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

    public static void veurestock (int[][] productesrestants)
    {

        for (int i =0; i<productesrestants.length;i++)
        {
            System.out.println();
            System.out.print(" ");
            for(int j =0; j<productesrestants[0].length;j++)
            {
                System.out.print(" " + productesrestants[i][j]);
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

    //Funcio on guardem l'stock restant
    public static void productesstock (int[][] productesrestants)
    {
        productesrestants[0][0]= 0;
        productesrestants[0][1]= 4;
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

    //Funcio on guardem els diners
    public static void preus (double[][] preusparticulars)
    {
        preusparticulars[0][0]= 1.50;
        preusparticulars[0][1]= 2.50;
        preusparticulars[0][2]= 2;

        preusparticulars[1][0]= 1;
        preusparticulars[1][1]= 2.50;
        preusparticulars[1][2]= 2;

        preusparticulars[2][0]= 1.50;
        preusparticulars[2][1]= 2;
        preusparticulars[2][2]= 1.50;

        preusparticulars[3][0]= 2.50;
        preusparticulars[3][1]= 2;
        preusparticulars[3][2]= 1.50;

    }


    //Funcio a on demanarem al client quin producte vol
    public static int[] demanarproducte (String[][] taulastock)
    {
        Scanner lector = new Scanner (System.in);
        boolean correcta = false;
        int []posicio = new int[2];
        System.out.println();
        contingutmaquina(taulastock);

        String producte = "A1";

        while(!correcta)
        {
            System.out.print("Posa el numero del producte que vols comprar: ");
            producte = lector.nextLine();

            for(int i=0; i< 4 && !correcta;i++)
            {
                for(int j=0; j< 3;j++)
                {
                    if(producte.equals(taulastock[i][j]))
                    {
                        correcta = true;
                    }

                }
            }
        }

        posicio[0] = producte.charAt(0)-'A';
        posicio[1] = producte.charAt(1)-'1';

        return posicio;

    }

    //Aqui fem una funcio que en el cas que l'usuari posi un numero de producte que no i sigui no ens el deici
   /* public static void restriccio (String[][] taulastock, int posicio[])
    {
    
    
    
    }*/


//Aqui fem una funcio boolean que ens dira si queda stock del producte que demana l'usuari
    public static boolean hihastock (int[][] productesrestants, int posicio[]){
    
       boolean hihastock = false;

       int fila = posicio[0];
       int columna = posicio[1];

       if(0 >= productesrestants[fila][columna])
       {
         hihastock = false;
       }
       else 
       {
         hihastock= true;
       }

       return hihastock;

    }

    //Aqui fare la funcio per mostrar el preu del producte que ha seleccionat l'usuari

    public static double preuproducte (double[][] preusparticulars, int posicio[]){
    
        boolean hihastock = false;
 
        int fila = posicio[0];
        int columna = posicio[1];
 
        return preusparticulars[fila][columna];
 
     }


    //Un cop l'usuari compra un producte li restem 1 al stock d'aquell producte
    public static void restastock (int[][] productesrestants, int posicio[]){

        int fila = posicio[0];
        int columna = posicio[1];

        productesrestants[fila][columna]--;

    }


   public static void main(String [] args){

    String [][]taulastock = new String[4][3];
    int [][]productesrestants = new int[4][3];
    double [][]preusparticulars = new double[4][3];
    contingutmaquina(taulastock);
    estructuratauler(taulastock);
    productesstock(productesrestants);
    preus(preusparticulars);
 //  int posicio[] = demanarproducte(taulastock);

    boolean torna = false;
    productesstock(productesrestants);

    while(!torna)
    {

        int posicio[] = demanarproducte(taulastock);

        if(hihastock(productesrestants, posicio))
        {
            
            if(!torna)
            {
                restastock(productesrestants, posicio);
                System.out.print(preuproducte(preusparticulars, posicio));
            } 
     
        }
        else
        {
            torna =true; 
        }
    }  

    
    }
}
