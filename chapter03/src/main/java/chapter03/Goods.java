package chapter03;

public class Goods {
	public static int countOfGoods = 0;
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		if(price < 0) {
			price = 0;
		}
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCountStock() {
		return countStock;
	}


	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}


	public int getCountSold() {
		return countSold;
	}
	
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}


	public void showInfo() {
		System.out.println("Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]");
	}

//	public int calcDiscountPrice(double)
		
	
}
