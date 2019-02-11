
public class Matrix {

	
	//figure out how pass by references work in method calls
	private double[][] Matrix;

	public Matrix(int rows, int cols) {
		Matrix = new double[rows][cols];
	}

	public void set(int row, int col, double val) throws MatrixException {
		Matrix[row][col] = val;

		// gotta make a matrixException for values outside range
	}

	public double[][] mult(Matrix input, double scalar) {
		//scalar multiplication
		
		//does this create a new matrix in memory or edit the pass in?

		
		for (int rows =0; rows< input.Matrix.length; rows++) {
			for(int cols =0 ; cols<input.Matrix[0].length; cols++) {
				input.Matrix[rows][cols] *= scalar;
			}
		}
		
		return input.Matrix;
	}
}



