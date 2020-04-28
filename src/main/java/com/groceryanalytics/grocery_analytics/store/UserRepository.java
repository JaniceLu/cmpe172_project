package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;
import com.groceryanalytics.grocery_analytics.store.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
