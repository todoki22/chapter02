package chapter02;

public class Goods {
	private static int countOfGoods;
	private String name;
	private int price;
	private int countStcok;
	private int countSold;
	
	public Goods() {
		countOfGoods++;
	}
	
	public Goods( String name, int price, int countStock, int countSold ) {
		countOfGoods++;

		this.name = name;
		this.price = price;
		this.countStcok = countStock;
		this.countSold = countSold;
	}
	
	public static int getCountOfGoods() {
		return countOfGoods;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if( price < 0 ) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStcok() {
		return countStcok;
	}

	public void setCountStcok(int countStcok) {
		this.countStcok = countStcok;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public String getName() {
		return name;
	}
	
	public int calcDisountPrice( int percentage ) {
		return price * percentage / 100;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStcok=" + countStcok + ", countSold=" + countSold
				+ "]";
	}

	public void showInfo() {
		System.out.println( 
			"[name=" + name + "," + 
		    "price=" + price + "," + 
			"countStock=" + countStcok + "," + 
		    "countSold=" + countSold + "]" );
	}
}
