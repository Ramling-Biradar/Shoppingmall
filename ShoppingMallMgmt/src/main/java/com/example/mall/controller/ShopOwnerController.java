package com.example.mall.controller;

import com.example.mall.model.ShopOwner;
import com.example.mall.service.ShopOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shopowners")
public class ShopOwnerController {

    private final ShopOwnerService shopOwnerService;

    @Autowired
    public ShopOwnerController(ShopOwnerService shopOwnerService) {
        this.shopOwnerService = shopOwnerService;
    }

    @PostMapping
    public ShopOwner addShopOwner(@RequestBody ShopOwner shopOwner) {
        return shopOwnerService.addShopOwner(shopOwner);
    }

    @GetMapping("/{id}")
    public ShopOwner getShopOwnerById(@PathVariable int id) {
        return shopOwnerService.searchShopOwner(id);
    }

    @PutMapping("/{id}")
    public ShopOwner updateShopOwner(@PathVariable int id, @RequestBody ShopOwner shopOwner) {
        shopOwner.setId(id);
        return shopOwnerService.updateShopOwner(shopOwner);
    }

    @DeleteMapping("/{id}")
    public boolean deleteShopOwner(@PathVariable int id) {
        return shopOwnerService.deleteShopOwner(id);
    }
}
