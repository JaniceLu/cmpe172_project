package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonthCount {

    @Id
    //@ForeignKey
	private Integer sid;
    private String month;
    private Integer year;
    private Integer count;
	
	public Integer getSid()
	{
		return sid;
	}
	
	public String getMonth()
	{
		return month;
    }
    
    public Integer getYear()
    {
        return year;
    }
	
	public Integer getCount()
	{
		return count;
	}

}