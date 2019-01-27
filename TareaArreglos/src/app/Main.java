
package app;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author ant & mónica
 */
public class Main {
    
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Uno();
        Dos();
        Tres();
        Cuatro();
    }

    public static void Uno() {
        System.out.println("Ingrese un numero: ");
        int a = Integer.parseInt(in.next());
        int[][] mat = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j)
                    mat[i][j] = 1;
                else
                    mat[i][j] = 0;
            }
        }
        Print(a, mat);
    }

    public static void Dos() {
        System.out.println("Ingrese un numero: ");
        int a = Integer.parseInt(in.next());
        int[][] mat = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                mat[i][j] = 1;
            }
        }
        for (int i = 0; i < a; i++) {
            mat[a - i - 1][i] = 0;
        }
        Print(a, mat);

    }


    public static void Tres() {
        System.out.println("Ingrese un número");
        int a = in.nextInt();
        int[] sum = new int[a];
        int[][] mat = new int[a][a];
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                mat[i][j] = (int) (Math.random() * 11 - 1);
                System.out.print(mat[i][j]);
                if (mat[i][j] % 2 == 0)
                    sum[i] = sum[i] + mat[i][j];
            }
            v.add(sum[i]);
            System.out.println(" : suma = " + v.elementAt(i));
        }
    }

    public static void Cuatro() {
        System.out.println("Ingrese la cantidad de filas: ");
        int x = in.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int y = in.nextInt();
        int may = 0, men = 10;
        int mat[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat[i][j] = (int) (Math.random() * 11 -1);
                if (mat[i][j] > may){
                    may = mat[i][j];
                }
                if(mat[i][j] < men){
                    men = mat[i][j];
                }
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Mayor: "+may);
        System.out.println("Menor: "+men);


    }

    public static void Print(int a, int[][] mat) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
