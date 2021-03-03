
public class Stock {

    //Estructura de la taula

    public static void estructuratauler (char[][] taulellstock)
    {

        for (int i =0; i<taulellstock.length;i++)
        {
            System.out.println();
            System.out.print((i+1) + " ");
            for(int j =0; j<taulellstock[0].length;j++)
            {
                System.out.print(" " + taulellstock[i][j]);
            }
        }
    }

    //Posicio dels productes
    //Cridem el contingut de la maquina

    public static void contingutmaquina(char[][] taulellstock)
    {
        taulellstock[0][0]='A';
        taulellstock[0][1]='A';
        taulellstock[0][2]='A';

        taulellstock[1][0]='B';
        taulellstock[1][1]='B';
        taulellstock[1][2]='B';

        taulellstock[2][0]='C';
        taulellstock[2][1]='C';
        taulellstock[2][2]='C';

        taulellstock[3][0]='D';
        taulellstock[3][1]='D';
        taulellstock[3][2]='D';

    }

   // public static void contingutmaquinan(char[][] stock)

   public static void main(String [] args){

    char [][]taulastock = new char[4][4];
    contingutmaquina(taulastock);
    estructuratauler(taulastock);

    
    }
}
