package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.groceryanalytics.grocery_analytics.store.WeekCount;

public interface WeekCountRepository extends CrudRepository<WeekCount, Integer>{

    //Finds the list of stores by store id
    List<WeekCount> findBySid(Integer sid);

}