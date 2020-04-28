package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Entity
public class Analytics {

    @Id
    //@ForeignKey
	private Integer sid;
    private String mostPopAisle;
    private String leastPopAisle;
    private Integer avgAge;
    private String itemRestock;
    private String itemWasted;
	
	public Integer getSid()
	{
		return sid;
	}
    
    public String getMostPopAisle()
    {
        return mostPopAisle;
    }

    public String getLeastPopAisle()
    {
        return leastPopAisle;
    }
	
	public Integer getAvgAge()
	{
		return avgAge;
    }
    
    public String getItemRestock()
    {
        return itemRestock;
    }

    public String getItemWasted()
    {
        return itemWasted;
    }

}