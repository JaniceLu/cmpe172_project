package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WeekCount {

    @Id
	private Integer dataid;
	private Integer sid;
    private String week;
    private Integer count;
	
	public Integer getDataId()
	{
		return dataid;
	}

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

	@Override
	public String toString()
	{
		return String.format("WeekCount [id=%d, count=%d, week=%s]", sid, count, week);
	}

}