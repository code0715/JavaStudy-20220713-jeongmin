package j14_lombok.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Product {
	private Product product;
	
	private int productCode;			//제품코드	  :20220802
	private String productName;			//제품명	  :스타벅스 텀블러
	private String productCategory;		//제품카테고리:텀블러
	private String createDate;			//생산일자	  :2022-08-02
	
	public static Product builder() {
		Product product = new Product();
		product.setProduct(product);
		return product.getProduct();
	
	}
	public Product build() {
		return this;
	}
	public Product productCode(int productCode) {
		this.productCode = productCode;
		return product;
	}
	public Product productName(String productName) {
		this.productName = productName;
		return product;
	}
	public Product productCatecory(String productCategory) {
		this.productCategory = productCategory;
		return product;
	}
	public Product createDate(String createDate) {
		this.createDate = createDate;
		return product;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productCategory="
				+ productCategory + ", createData=" + createDate + "]";
	}
	
}
