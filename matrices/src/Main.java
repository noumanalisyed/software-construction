public class Main {
    public static void main(String[] args) {
        int d[][] = {{1,2},{4,5}};
        int e[][] = {{5,8},{2,9}};

        Matrix matrix1 = new Matrix(2,2);
        Matrix matrix2= new Matrix(2,2);
       // matrix1.printMatrix();
       // System.out.println("\n\n\n");
       // matrix2.printMatrix();

        matrix1.inputMatrix(d,2,2);
        matrix2.inputMatrix(e,2,2);

        matrix1.printMatrix();
        System.out.println("\n");
        matrix2.printMatrix();
        System.out.println("\n");
        Matrix matrix3 = matrix1.add(matrix2);
        matrix3.printMatrix();
        System.out.println("\n");
        Matrix matrix4 = matrix1.sub(matrix2);
        matrix4.printMatrix();
        System.out.println("\n");
        Matrix matrix5 = matrix1.mul(matrix2);
        matrix5.printMatrix();
        System.out.println("\n");
    }
}
