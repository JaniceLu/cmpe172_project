package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Entity
public class WeekCount {

    @Id
    //@ForeignKey
	private Integer sid;
    private String week;
    private Integer count;
	
	public Integer getSid()
	{
		return sid;
	}
	
	public String getWeek()
	{
		return week;
	}
	
	public Integer getCount()
	{
		return count;
	}

}