import test_packed.Test_Random;


public class testMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Random tr = new Test_Random();
		tr.testRandoms(100);
		tr.testRandoms(1000);
		tr.testRandoms(10000);
		tr.testRandoms(100000);
		tr.testRandoms(1000000);
		tr.testRandoms(10000000);
	}

}
