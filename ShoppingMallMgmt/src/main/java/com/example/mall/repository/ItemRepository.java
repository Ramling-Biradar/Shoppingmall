package com.example.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mall.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
