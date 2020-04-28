package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;
import com.groceryanalytics.grocery_analytics.store.MonthCount;

public interface MonthCountRepository extends CrudRepository<MonthCount, Integer>{

}