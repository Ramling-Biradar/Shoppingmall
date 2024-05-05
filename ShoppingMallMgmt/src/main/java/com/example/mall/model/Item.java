package com.example.mall.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private LocalDate manufacturing;
    private LocalDate expiry;
    private float price;
    private String category;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(long id, String name, LocalDate manufacturing, LocalDate expiry, float price, String category,
			Shop shop) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturing = manufacturing;
		this.expiry = expiry;
		this.price = price;
		this.category = category;
		this.shop = shop;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}

	public LocalDate getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", category=" + category + ", shop=" + shop + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getManufacturing()=" + getManufacturing() + ", getExpiry()="
				+ getExpiry() + ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory() + ", getShop()="
				+ getShop() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

    
    // Getters and setters
}
