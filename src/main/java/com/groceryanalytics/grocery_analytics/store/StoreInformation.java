package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreInformation {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sid;
	private String name;
	private String operating_hours;
    private String location;
    private String phone;
	
	public Integer getSid()
	{
		return sid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getHours()
	{
		return operating_hours;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String getPhone()
	{
		return phone;
	}

	@Override
	public String toString()
	{
		return String.format("Store[id=%d, name=%s]", sid, name);
	}

}