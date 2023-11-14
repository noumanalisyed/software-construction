public class Matrix {
    private int row;
    private int col;

    private int data[][];
    public Matrix(){
        row = col = 0;
    }
    public Matrix(int row,int col){
        this.row = row;
        this.col = col;
        data = new int[row][col];
    }
    public void printMatrix(){
        for (int i=0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j]+"   ");
            }
            System.out.print("\n");
        }
    }
    public void inputMatrix(int newData[][],int r,int c){
        row = ( r > 0) ? r : 0;
        col = (c > 0 ) ? c : 0;

        data = new int[row][col];
        for (int i=0; i < row; i++){
            for (int j = 0; j < col; j++) {
                data[i][j] = newData[i][j];
            }
        }
    }

    public Matrix add(Matrix matrix){
        Matrix result = null;
        if(this.row == matrix.row && this.col == matrix.col){
            result = new Matrix(row,col);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    result.data[i][j] = this.data[i][j] + matrix.data[i][j];
                }
            }

        }
        else{
            System.out.println("Matrix -- Subtraction of two matrices " +
                    "is not possible because there order is not same");
        }
        return result;
    }
    public Matrix sub(Matrix matrix){
        Matrix result = null;
        if(this.row == matrix.row && this.col == matrix.col){
            result = new Matrix(row,col);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    result.data[i][j] = this.data[i][j] - matrix.data[i][j];
                }
            }

        }
        else{
            System.out.println("Matrix -- Addition of two matrices " +
                    "is not possible because there order is not same");
        }
        return result;
    }
    public Matrix mul(Matrix matrix){
        Matrix result = null;
        if(this.col  == matrix.row) {
            result = new Matrix(this.row,matrix.col);
            for (int i = 0; i < this.row; ++i)
                for (int j = 0; j < matrix.col; ++j)
                    for (int k = 0; k < this.col; ++k) {
                        result.data[i][j] += this.data[i][k] * matrix.data[k][j];
                    }
        }
        else{
            System.out.println("Matrix -- Multiplication of two matrices " +
                    "is not possible because there order is not same");
        }
        return result;
    }

}
