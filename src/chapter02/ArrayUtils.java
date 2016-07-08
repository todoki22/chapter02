package chapter02;

public class ArrayUtils {
	public static int[] concat( int[] arrayInt1, int[] arrayInt2 ) {
		
		// 각 배열의 길이 구하기
		int length1 = arrayInt1 == null ? 0 : arrayInt1.length; 
		int length2 = arrayInt2 == null ? 0 : arrayInt2.length; 
		
		// 두 배열의 길이가 모두 0이면,
		if( length1 == 0 && length2 == 0 ) {
			return null;
		}
		
		// 두 배열의 값을 저장할 새로운 배열 생성
		int[] arrayResult = new int[ length1 + length2 ];
		int index = 0; 
		
		// 첫 번째 배열 저장
		for( int i : arrayInt1 ) {
			arrayResult[ index++ ] = i;
		}
		
		// 두 번째 배열 저장
		for( int i : arrayInt2 ) {
			arrayResult[ index++ ] = i;
		}
		
		return arrayResult;
	}
	
	public static int[] doubleToInt( double[] arrayDouble ) {
		if( arrayDouble == null ) {
			return null;
		}
		
		int length = arrayDouble.length; 
		int[] arrayInt = new int[ length ];
		for( int i = 0; i < length; i++ ) {
			arrayInt[ i ] = (int)arrayDouble [ i ];
		}
		
		return arrayInt;
	}
	
	public static double[] intToDouble( int[] arrayInt ) {
		if( arrayInt == null ) {
			return null;
		}
		
		int length = arrayInt.length; 
		double[] arrayDouble = new double[ length ];
		for( int i = 0; i < length; i++ ) {
			arrayDouble[ i ] = arrayInt [ i ];
		}
		
		return arrayDouble;
	}
}
