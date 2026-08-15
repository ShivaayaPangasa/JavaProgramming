package Module1.Q27_Matrix;

public class Matrix{
    public static void main(String[] args){

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{9,8,7},{6,5,4},{3,2,1}};

        int[][] sum = mat_add(matrix1, matrix2);
        int[][] product = mat_mul(matrix1, matrix2);


        System.out.println("Sum of matrices");
        printMatrix(sum);

        System.out.println("Product of matrices:");
        printMatrix(product);

    }

    public static int[][] mat_add(int[][] a, int[][] b){
        int rows = a.length; //rows - 3 
        int cols = a[0].length; // columns - 3
        int[][] result = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j] = a[i][j] + b [i][j];
            }
        }
        return result;
    }

    public static int[][] mat_mul(int[][] a, int[][] b){
        int rows = a.length; //rows - 3
        int cols = b[0].length; //column - 3
        int common = a[0].length; 
        int[][] result = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                for(int k=0; k < common; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}