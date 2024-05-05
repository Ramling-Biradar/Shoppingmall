package com.example.mall.controller;

import com.example.mall.model.Item;
import com.example.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable long id) {
        return itemService.searchItem(id);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable long id, @RequestBody Item item) {
        item.setId(id);
        return itemService.updateItem(item);
    }

    @DeleteMapping("/{id}")
    public boolean deleteItem(@PathVariable long id) {
        return itemService.deleteItem(id);
    }
}
