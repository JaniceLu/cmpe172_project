package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Entity
public class HourCount {

    @Id
    //@ForeignKey
	private Integer sid;
    private String hour;
    private Integer count;
	
	public Integer getSid()
	{
		return sid;
	}
	
	public String getHour()
	{
		return hour;
	}
	
	public Integer getCount()
	{
		return count;
	}

}