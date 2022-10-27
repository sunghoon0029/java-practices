package prob02;

public class Goods {
	private String title;
	private int price;
	private int count;
	
	public Goods() {
		this.title = title;
		this.price = price;
		this.count = count;	
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void showInfo() {
		System.out.println(title + "(가격:" + price + "원)이 " + count + "개 입고 되었습니다.");
		
	}
	
}
