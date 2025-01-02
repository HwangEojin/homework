package shopping;

public class Main {
	public static void main(String[] args) {
		Product obj1 = new Product(0, "Cheese", 1000, 10);
		Product obj2 = new Product(1, "Wine", 10000, 10);
		Product obj3 = new Product(2, "Coke", 2000, 10);
		Product obj4 = new Product(2, "Bread", 500, 50);

		// 상품 정보 출력
		obj1.displayProduct();

		// 재고 확인
		System.out.println("재고 체크 : " + obj1.isStock(20));

		// 재고 업데이트
		obj1.updateStock(-1);
		obj1.updateStock(2);

		// 장바구니 추가
		Cart cart = new Cart();

		// 상품 추가
		cart.addProduct(obj1, 1);
		cart.addProduct(obj2, 5);
		cart.addProduct(obj3, 20);
		cart.addProduct(obj4, 25);

		// 장바구니 확인
		cart.displayCart();
		
		//상품 제거
		cart.removeProduct("Cheese");
		cart.removeProduct("Wine");
		
		cart.displayCart();

	}
}
