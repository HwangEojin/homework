package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	// 필드
	private List<Product> productList;

	// 생성자
	public Cart() {
		this.productList = new ArrayList<Product>();
	}

	// 메소드
	
	//장바구니에 상품을 추가하는 메소드
	public void addProduct(Product product, int quantity) {
		if(product.isStock(quantity)) {
			product.updateStock(-quantity);
			this.productList.add(product);
			System.out.println(product.getName() + "이(가) 장바구니에" + quantity + "개 추가 되었습니다.");
		}else {
			System.out.println(product.getName()+"의 재고가 부족하여 더 이상 추가할 수 없습니다.");
		}
		

	}
	
	//장바구니에 상품을 삭제하는 메소드
	public void removeProduct(String productName) {
		boolean check = false;
		
		for(Product product : productList) {
			if (product.getName().equals(productName)) {
				productList.remove(product);
				System.out.println(product.getName()+"이(가) 정상적으로 장바구니에서 제거되었습니다.");
				check = true;
				break;
			}
		}
		if(!check) {
			System.out.println(productName + "은(는) 장바구니에 없습니다.");
		}

	}
	
	//장바구니에 담긴 모든 상품과 가격을 출력
	public void displayCart() {
		if(productList.isEmpty()){
			System.out.println("장바구니에 담긴 상품이 없습니다.");
		}else {
			int total = 0;
			System.out.println();
			System.out.println("------장바구니------");
			
			for (Product product : productList) {
				product.displayProduct();
				total += product.getPrice();
			}
			System.out.println();
			System.out.println("총 가격 : \t" + total + "원");
			
		}

	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
