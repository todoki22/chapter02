package chapter02;

public class ArrayUtilsTest {

	public static void main(String[] args) {

		// 1. ArrayUtils.intToDouble(..) 테스트
		int[] arrayInt = { 10, 20, 30, 40, 50 };
		double[] arrayDouble = ArrayUtils.intToDouble( arrayInt );
		for( double d : arrayDouble ) {
			System.out.println( d );
		}
		
		// 2. ArrayUtils.doubleToInt(..) Test
		double[] arrayDouble2 = { 1.23, 2.34, 3.45, 4.566 };
		int[] arrayInt2 = ArrayUtils.doubleToInt( arrayDouble2 );
		for( int i : arrayInt2 ) {
			System.out.println( i );
		}
		
		// 3. ArrayUtils.concat(..) Test
		int[] arrayInt3 = { 10, 20, 30 };
		int[] arrayInt4 = { 40, 50, 60 };
		
		int[] arrayInt5 = ArrayUtils.concat( arrayInt3, arrayInt4 );
		for( int i : arrayInt5 ) {
			System.out.println( i );
		}
	}

}
