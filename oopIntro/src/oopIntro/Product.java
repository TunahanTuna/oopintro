package oopIntro;

public class Product {
	
	// Encapsulation
	private int id;
	private String name;
	private double unitPrice;
	private String Detail;
	private double discount;
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice, String Detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.Detail = Detail;
		this.discount = discount;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return Detail;
	}

	public void setDetail(String detail) {
		Detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice- (this.unitPrice * this.discount / 100);
	}
	
	
	
	

}
