import java.util.Arrays;

/**
 * @author Till Wischniewski
 * @version 1.01
 */

public class Testklasse
{
    public static void printMatrix (char [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {

        System.out.println("True: Es gibt einen bzw. mehrere Ausgänge.");
        System.out.println("False: Kein Ausgang.");
        System.out.println();


        char [][] arrayLab = {  {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                                {'X', ' ', 'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                                {'X', ' ', ' ', ' ', 'X', ' ', ' ', 'X', ' ', 'X'},
                                {'X', ' ', ' ', 'X', 'X', ' ', 'X', 'X', ' ', 'X'},
                                {'X', 'X', 'X', 'X', ' ', ' ', ' ', 'X', ' ', 'X'},
                                {'X', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', 'X'},
                                {'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                                {'X', ' ', ' ', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                                {'X', ' ', ' ', 'X', 'X', 'X', ' ', 'X', ' ', ' '},
                                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};

        char [][] arrayLab2 =
                {{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                 {'X', ' ', 'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                 {'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', 'X'},
                 {'X', ' ', ' ', 'X', 'X', ' ', 'X', 'X', ' ', 'X'},
                 {'X', ' ', 'X', 'X', ' ', ' ', ' ', 'X', ' ', 'X'},
                 {'X', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', 'X'},
                 {'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                 {'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X', ' ', 'X'},
                 {'X', ' ', ' ', 'X', 'X', 'X', ' ', 'X', ' ', 'X'},
                 {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};

        printMatrix(arrayLab);

        Labyrinth runner = new Labyrinth(arrayLab);
        //runner.printLabyrinth();
        System.out.println(runner.existPath(4,4));
        //runner.printLabyrinth();
        printMatrix(arrayLab);

        Labyrinth runner2 = new Labyrinth(arrayLab2);
        System.out.println(runner2.existPath(4,4));
        printMatrix(arrayLab2);

    }

}
