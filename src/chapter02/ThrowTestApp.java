package chapter02;

import java.io.IOException;

public class ThrowTestApp {

	public static void main(String[] args) {
		try {
			test();
		} catch( Exception ex ){
			ex.printStackTrace();
		}
	}
	
	public static void test() throws IOException, MyException {
		ThrowTest tt = new ThrowTest();
		tt.suspiciousMethod();
	}

}
