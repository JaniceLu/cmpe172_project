package com.groceryanalytics.grocery_analytics.store;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.groceryanalytics.grocery_analytics.store.HourCount;

public interface HourCountRepository extends CrudRepository<HourCount, Integer>{

    //Finds the list of stores by store id
    List<HourCount> findBySid(Integer sid);

}