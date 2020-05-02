package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class YearCount {

    @Id
    //@ForeignKey
	private Integer sid;
    private Integer year;
    private Integer count;
	
	public Integer getSid()
	{
		return sid;
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