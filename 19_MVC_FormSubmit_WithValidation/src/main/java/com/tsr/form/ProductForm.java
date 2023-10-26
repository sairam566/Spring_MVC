package com.tsr.form;

public class ProductForm {
	private String productName;
	private String description;
	private String manufacturer;
	private String category;
	private double price;

	public ProductForm() {
		super();
	}

	public ProductForm(String productName, String description, String manufacturer, String category, double price) {
		super();
		this.productName = productName;
		this.description = description;
		this.manufacturer = manufacturer;
		this.category = category;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductForm [productName=" + productName + ", description=" + description + ", manufacturer="
				+ manufacturer + ", category=" + category + ", price=" + price + "]";
	}
}
