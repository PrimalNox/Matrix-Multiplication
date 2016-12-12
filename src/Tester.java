public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] multiplicand = new double[][] { { 1, 2, -2, 0 },
				{ -3, 4, 7, 2 }, { 6, 0, 3, 1 } };

		double[][] multiplier = new double[][] { { -1, 3 }, { 0, 9 },
				{ 1, -11 }, { 4, -5 } };

		System.out.println(MatrixMult.toString(MatrixMult.multiplyByMatrix(multiplicand, multiplier)));
	}
}
