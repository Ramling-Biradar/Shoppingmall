// Service implementations in com.example.mall.service.impl package

package com.example.mall.service.impl;

import com.example.mall.model.Shop;
import com.example.mall.repository.ShopRepository;
import com.example.mall.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    @Autowired
    public ShopServiceImpl(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @Override
    public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public Shop updateShop(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public Shop searchShopById(int id) {
        return shopRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteShop(int id) {
        shopRepository.deleteById(id);
        return !shopRepository.existsById(id);
    }
}

