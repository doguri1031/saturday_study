package review2;

import java.util.Optional;

public class Printer {
	private String id;				
	private String manufacturer; 	
	private int price;
	
	public Printer(String id, String manufacturer, int price) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Optional<Integer> getPrice() {
		return Optional.ofNullable(price);
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("ID는 [%s] Manufacturer는 [%s] price는 [%d]", id, manufacturer, price);
	}				
	
}


