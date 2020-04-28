package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;
import com.groceryanalytics.grocery_analytics.store.HourCount;

public interface HourCountRepository extends CrudRepository<HourCount, Integer>{

}