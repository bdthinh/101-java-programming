import java.util.*;

// Nhap ma tran vuong
// m = n;
// Xoay ma tran
// Tim gia tri tai phan tu vi tri [x][y]

public class Main {
    public static void main(String[] args) {
        int[][] matrix = nhapMatrix();
        int[][] rotatedMatrix = rotate90degreeMatrix(matrix);
        xuatMatrix(rotatedMatrix);
    }

    public static int[][] rotate90degreeMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] resultMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = matrix[n - 1 - j][i];
            }
        }
        return resultMatrix;
    }

    // a00 a01 a02
    // a10 a11 a12
    // a20 a21 a22

    // rotate
    // matrix[i][j] = matrix[n - 1 - j][i]

    // a20  a10   a00
    // a21  a11   a01
    // a22  a12   a02

    public static int[] nhapMang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // one-dim array
    // matrix: two-dim array

    public static int[][] nhapMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int m = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void xuatMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

