package shopping;

public class Product {

	// 필드
	private int id;
	private String name;
	private int price;
	private int stock;

	public Product(int id, String name, int price, int stock) {
		if (price < 0 || stock < 0) {
			throw new IllegalArgumentException("가격과 재고는 음수가 될 수 없습니다.");
		}
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	// 상품 정보 출력
	public void displayProduct() {
		System.out.println("상품 ID : " + this.id + "\t| 상품 이름 : " + this.name + "\t| 상품 가격 : " + this.price
				+ "\t| 상품 재고 : " + this.stock);
	}

	// 재고 확인 메소드
	public boolean isStock(int param) {
		return param <= this.stock;
	}

	// 재고 업데이트 메소드
	public void updateStock(int param) {
		if (this.stock + param < 0) {
			System.out.println("재고의 개수는 음수가 될 수 없습니다.");
			return;
		}
		this.stock += param;
		System.out.println("재고 개수가 업데이트 되었습니다. 현재 재고 : " + this.stock);

	}

}
