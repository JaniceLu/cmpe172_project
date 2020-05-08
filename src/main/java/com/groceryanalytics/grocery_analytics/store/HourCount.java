package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HourCount {

    @Id
	private Integer dataid;
	private Integer sid;
	private String day;
    private String hour;
    private Integer count;
	
	public Integer getDataId()
	{
		return dataid;
	}
	
	public Integer getSid()
	{
		return sid;
	}

	public String getDay()
	{
		return day;
	}
	
	public String getHour()
	{
		return hour;
	}
	
	public Integer getCount()
	{
		return count;
	}

	@Override
	public String toString()
	{
		return String.format("HourCount [id=%d, day=%s, hour=%s, count=%d]", sid, day, hour, count);
	}

}