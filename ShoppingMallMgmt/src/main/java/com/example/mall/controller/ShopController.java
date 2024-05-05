package com.example.mall.controller;

import com.example.mall.model.Shop;
import com.example.mall.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shops")
public class ShopController {

    private final ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping
    public Shop addShop(@RequestBody Shop shop) {
        return shopService.addShop(shop);
    }

    @GetMapping("/{id}")
    public Shop getShopById(@PathVariable int id) {
        return shopService.searchShopById(id);
    }

    @PutMapping("/{id}")
    public Shop updateShop(@PathVariable int id, @RequestBody Shop shop) {
        shop.setShopId(id);
        return shopService.updateShop(shop);
    }

    @DeleteMapping("/{id}")
    public boolean deleteShop(@PathVariable int id) {
        return shopService.deleteShop(id);
    }
}
