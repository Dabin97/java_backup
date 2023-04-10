package vo;

import java.util.Objects;

//제품번호, 제품명, 제조사, 재고, 소비자가격
public class ProductVO {
	private String productNo;
	private String productName;
	private String productCompany;
	private int stock;
	private int price;
	
	
	public ProductVO(String productNo, String productName, String productCompany, int stock, int price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productCompany = productCompany;
		this.stock = stock;
		this.price = price;
	}


	public String getProductNo() {
		return productNo;
	}


	public String getProductName() {
		return productName;
	}


	public String getProductCompany() {
		return productCompany;
	}


	public int getStock() {
		return stock;
	}


	public int getPrice() {
		return price;
	}


	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(price, productCompany, productName, productNo, stock);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVO other = (ProductVO) obj;
//		return price == other.price && Objects.equals(productCompany, other.productCompany)
//				&& Objects.equals(productName, other.productName) && Objects.equals(productNo, other.productNo)
//				&& stock == other.stock;    //본래 equals 식
		return Objects.equals(productNo, other.productNo); 
	//equals메서드 보면 제품번호 이외에 값들도 같은지 비교하는 부분이 추가되있어서 제품번호로만은 검색이 안됩니다.
	}



	@Override
	public String toString() {
		return "ProductVO [productNo=" + productNo + ", productName=" + productName + ", productCompany="
				+ productCompany + ", stock=" + stock + ", price=" + price + "]";
	}
	
	
	
}//class
