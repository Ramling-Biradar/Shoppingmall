// ItemServiceImpl.java
package com.example.mall.service.impl;

import com.example.mall.model.Item;
import com.example.mall.repository.ItemRepository;
import com.example.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item searchItem(long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteItem(long id) {
        itemRepository.deleteById(id);
        return !itemRepository.existsById(id);
    }
}
