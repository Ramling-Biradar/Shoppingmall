package com.example.mall.service;
import com.example.mall.model.Shop;
public interface ShopService {
	Shop addShop(Shop shop);
    Shop updateShop(Shop shop);
    Shop searchShopById(int id);
    boolean deleteShop(int id);

}
