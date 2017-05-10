package hu.helixlab;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
    /*
        int[][] matrix = {{1, 2, 4},
                {2, 4, 5}};

        int[][] matrix2 = {{1, 2},
                {2, 4},
                {3, 4}};

        MatrixOperation matrixOperation = new MatrixOperation();

        int[][] matrix_result = matrixOperation.multiplyWithMatrix(matrix, matrix2);
        for (int i = 0; i < matrix_result.length; i++) {
            for (int j = 0; j < matrix_result[i].length; j++) {
                System.out.print(matrix_result[i][j] + " ");
            }
            System.out.println();
        }
 */

        Sacramento[] array = new Sacramento[100];
        String[] row = null;
        int i = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Hp_Workplace\\IdeaProjects\\gyak12\\doksi\\SacramentocrimeJanuary2006.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                row = line.split(",");
                array[i] = new Sacramento();
                array[i].setDateTime(row[0]);
                array[i].setAddress(row[1]);
                array[i].setDiscrict(row[2]);
                array[i].setBeat(Integer.parseInt(row[3]));
                array[i].setGrid(Integer.parseInt(row[4]));
                array[i].setCrimedescr(row[5]);
                array[i].setNcic_code(Integer.parseInt(row[6]));
                array[i].setLatitude(Integer.parseInt(row[7]));
                array[i].setLongitude(Integer.parseInt(row[8]));
                i++;
                if (i == 99) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[i].toString());
        }
    }
}
