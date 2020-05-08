package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonthCount {

    @Id
	private Integer dataid;
	private Integer sid;
    private String month;
    private Integer year;
    private Integer count;
	
	public Integer getDataId()
	{
		return dataid;
	}

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

	@Override
	public String toString()
	{
		return String.format("MonthCount [id=%d, count=%d, month=%s, year=%d, ]", sid, count, month, year);
	}


}