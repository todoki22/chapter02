package chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		double d = 0.;
		
		try {
			// 의심나는 코드
			d = 10 / a;
			
		} catch( ArithmeticException ex ) {
			// 예외처리 (예외가 발생하면 실행 되는 코드)
			
			//1. logging( 파일, DB )
			System.out.println( "error:" + ex );
			//3. 사용자에게 메세지
			System.out.println( "죄송합니다. 비정상상황이 되어서 종료 합니다.");
			//4. 정상종료
			return;
		} finally {
			//2. 자원정리
			System.out.println( "자원정리!!!" );
		}
		
		System.out.println( d );
	}

}
