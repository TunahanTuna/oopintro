package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo v14",15000,"16 GB Ram",10); // �rnek Olu�turma, Referans Olu�turma
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("��ecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setCategoryName("Yiyecek");
		
		System.out.println(category1.getCategoryName());
		System.out.println(category2.getCategoryName());
				
		//------SOLID-------\\
		
	}

}
