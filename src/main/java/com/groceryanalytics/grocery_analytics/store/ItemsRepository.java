package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.groceryanalytics.grocery_analytics.store.Items;

public interface ItemsRepository extends CrudRepository<Items, Integer>{

    List<Items> findBySid(Integer sid);
    
}