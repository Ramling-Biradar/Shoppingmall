package com.example.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mall.model.ShopOwner;
@Repository
public interface ShopOwnerRepository extends JpaRepository<ShopOwner, Integer>{

}
