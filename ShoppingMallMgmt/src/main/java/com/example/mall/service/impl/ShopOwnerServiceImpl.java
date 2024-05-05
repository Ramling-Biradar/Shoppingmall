// ShopOwnerServiceImpl.java
package com.example.mall.service.impl;

import com.example.mall.model.ShopOwner;
import com.example.mall.repository.ShopOwnerRepository;
import com.example.mall.service.ShopOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopOwnerServiceImpl implements ShopOwnerService {

    private final ShopOwnerRepository shopOwnerRepository;

    @Autowired
    public ShopOwnerServiceImpl(ShopOwnerRepository shopOwnerRepository) {
        this.shopOwnerRepository = shopOwnerRepository;
    }

    @Override
    public ShopOwner addShopOwner(ShopOwner shopOwner) {
        return shopOwnerRepository.save(shopOwner);
    }

    @Override
    public ShopOwner updateShopOwner(ShopOwner shopOwner) {
        return shopOwnerRepository.save(shopOwner);
    }

    @Override
    public ShopOwner searchShopOwner(int id) {
        return shopOwnerRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteShopOwner(int id) {
        shopOwnerRepository.deleteById(id);
        return !shopOwnerRepository.existsById(id);
    }
}
