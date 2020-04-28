package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;
import com.groceryanalytics.grocery_analytics.store.WeekCount;

public interface WeekCountRepository extends CrudRepository<WeekCount, Integer>{

}