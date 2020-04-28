package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;
import com.groceryanalytics.grocery_analytics.store.YearCount;

public interface YearCountRepository extends CrudRepository<YearCount, Integer>{

}