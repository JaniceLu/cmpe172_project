package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;
import com.groceryanalytics.grocery_analytics.store.Items;

public interface ItemsRepository extends CrudRepository<Items, Integer>{

}