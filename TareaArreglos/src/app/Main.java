
package app;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author ant & mónica
 */
public class Main {
    //Se crea un scanner para capturar información desde la consola
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //Se inican los métodos desde el método main 
        Uno();
        Dos();
        Tres();
        Cuatro();
    }

    public static void Uno() {
        //Se crea una matriz  a la que se le asignarán 1s en su diagonal principal 
        System.out.println("Ingrese un numero: ");
        int a = Integer.parseInt(in.next());
        int[][] mat = new int[a][a];
        //For dentro de for que asigna 1s cuando i y j tienen el mismo valor, 
        //efectivamente asignando a una mátriz cuadrada 1s en la diagonal principal
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j)
                    mat[i][j] = 1;
                else
                    mat[i][j] = 0;
            }
        }
        //Se manda la matriz para que sea impresa
        Print(a, mat);
    }

    public static void Dos() {
        // Se crea una matriz a la que se le asignarán 0s en su diagonal secundaria
        System.out.println("Ingrese un numero: ");
        int a = Integer.parseInt(in.next());
        int[][] mat = new int[a][a];
        
        //Primero se llena toda la mátriz con 0s
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                mat[i][j] = 1;
            }
        }
        //Después, con el siguiente for, se llena con 0s la diagonal primaria, 
        //siempre y cuando esta mátriz sea cuadrada
        for (int i = 0; i < a; i++) {
            mat[a - i - 1][i] = 0;
        }
        //Se manda a imprimir
        Print(a, mat);

    }


    public static void Tres() {
        //Se crea una mátriz donde se hará la suma de las filas (numeros pares)
        System.out.println("Ingrese un número");
        int a = in.nextInt();
        //en el siguiente arreglo se guardan las sumas de las filas 
        int[] sum = new int[a];
        int[][] mat = new int[a][a];
        //De acuerdo a la tarea, estas sumas se tienen que guardar en un vector:
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                //Se llena la mátriz con valores random desde 0 hasta 100
                mat[i][j] = (int) (Math.random() * 101 - 1);
                System.out.print(mat[i][j]);
                //se el numero en i,j es par, se agrega a la suma en la posición 1
                if (mat[i][j] % 2 == 0)
                    sum[i] = sum[i] + mat[i][j];
            }
            //Al vector se le agrega la suma obtenida
            v.add(sum[i]);
            //Y se imprime la suma con el elemento del vector en la posición i
            System.out.println(" : suma = " + v.elementAt(i));
        }
    }

    public static void Cuatro() {
        // Se crea una mátriz de N*M y a continuación se encuentra el número mayor y menor  
        System.out.println("Ingrese la cantidad de filas: ");
        int x = in.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int y = in.nextInt();
        int may = 0, men = 10;
        int mat[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                //Se llena aleatoriamente con numeros del 0 al 100
                mat[i][j] = (int) (Math.random() * 101 -1);
                
                //Si el numero en mat(i,j) es mayor al mayor, el nuevo mayor es mat(i,j)
                if (mat[i][j] > may){
                    may = mat[i][j];
                }
                //Si el numero en mat(i,j) es menor al menor, el nuevo menor es mat(i,j)
                if(mat[i][j] < men){
                    men = mat[i][j];
                }
                //Se imprime la fila
                System.out.print(mat[i][j]);
            }
            //Se hace salto de linea
            System.out.println();
        }
        //Se imprimen tanto los mayores como los menores
        System.out.println("Mayor: "+may);
        System.out.println("Menor: "+men);


    }

    
    public static void Print(int a, int[][] mat) {
        //Método para imprimir las mátrices arriba creadas
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
