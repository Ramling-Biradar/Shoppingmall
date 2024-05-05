package com.example.mall.service;
import com.example.mall.model.ShopOwner;

public interface ShopOwnerService {
	 ShopOwner addShopOwner(ShopOwner shopOwner);
	    ShopOwner updateShopOwner(ShopOwner shopOwner);
	    ShopOwner searchShopOwner(int id);
	    boolean deleteShopOwner(int id);

}
