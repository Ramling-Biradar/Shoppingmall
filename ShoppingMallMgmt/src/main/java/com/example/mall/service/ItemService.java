package com.example.mall.service;
import com.example.mall.model.Item;
public interface ItemService {
	Item addItem(Item item);
    Item updateItem(Item item);
    Item searchItem(long id);
    boolean deleteItem(long id);

}
