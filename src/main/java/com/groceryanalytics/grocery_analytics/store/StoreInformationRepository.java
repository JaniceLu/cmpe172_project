package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;
import com.groceryanalytics.grocery_analytics.store.StoreInformation;

public interface StoreInformationRepository extends CrudRepository<StoreInformation, Integer>{

}