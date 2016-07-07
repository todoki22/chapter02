package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName( "nikon" );
		camera.setPrice( 500000 );
		camera.setCountSold( 10 );
		camera.setCountStcok( 50 );
		
		System.out.println( Goods.countOfGoods );
		
		camera.showInfo();
		System.out.println( camera );
		
		int discountPrice = camera.calcDisountPrice( 43 );
		System.out.println( discountPrice );
		
		Goods goods1 = new Goods( "cannon", 300000, 0, 100 );
		System.out.println( goods1 );
	}

}
