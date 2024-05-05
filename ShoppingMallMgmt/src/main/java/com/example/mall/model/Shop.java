package com.example.mall.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;

    private String shopCategory;

    private String shopName;

    private String customers;
    private String shopStatus;
    private String leaseStatus;

    @ManyToOne
    @JoinColumn(name = "shop_employee_id")
    private Employee shopEmployee;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    private List<Item> items;

    @OneToOne(mappedBy = "shop", cascade = CascadeType.ALL)
    private ShopOwner shopOwner;

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(int shopId, String shopCategory, String shopName, String customers, String shopStatus,
			String leaseStatus, Employee shopEmployee, List<Item> items, ShopOwner shopOwner) {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopName = shopName;
		this.customers = customers;
		this.shopStatus = shopStatus;
		this.leaseStatus = leaseStatus;
		this.shopEmployee = shopEmployee;
		this.items = items;
		this.shopOwner = shopOwner;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public Employee getShopEmployee() {
		return shopEmployee;
	}

	public void setShopEmployee(Employee shopEmployee) {
		this.shopEmployee = shopEmployee;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ShopOwner getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName + ", customers="
				+ customers + ", shopStatus=" + shopStatus + ", leaseStatus=" + leaseStatus + ", shopEmployee="
				+ shopEmployee + ", items=" + items + ", shopOwner=" + shopOwner + ", getShopId()=" + getShopId()
				+ ", getShopCategory()=" + getShopCategory() + ", getShopName()=" + getShopName() + ", getCustomers()="
				+ getCustomers() + ", getShopStatus()=" + getShopStatus() + ", getLeaseStatus()=" + getLeaseStatus()
				+ ", getShopEmployee()=" + getShopEmployee() + ", getItems()=" + getItems() + ", getShopOwner()="
				+ getShopOwner() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

   
}
