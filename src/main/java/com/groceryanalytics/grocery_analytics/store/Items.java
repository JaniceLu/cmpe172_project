package com.groceryanalytics.grocery_analytics.store;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Entity
public class Items {

    @Id
    //@ForeignKey
    private Integer dataid;
	private Integer sid;
    private String name;
    private String category;
    private Integer stockNum;
    private Integer stockTotal;
    private Double price;
    private String aisleName;
    
    public Integer getDataId()
    {
        return dataid;
    }

	public Integer getSid()
	{
		return sid;
	}
    
    public String getName()
    {
        return name;
    }

    public String getCategory()
    {
        return category;
    }
	
	public Integer getStockNum()
	{
		return stockNum;
    }
    
    public Integer getStockTotal()
    {
        return stockTotal;
    }

    public Double getPrice()
    {
        return price;
    }

    public String getAisleName()
    {
        return aisleName;
    }

    @Override
	public String toString()
	{
		return String.format("Items [id=%d, aisle_name=%s, category=%s, name=%s, price=%.2f, stock_num=%d, stock_total=%d]", sid, aisleName, category, name, price, stockNum, stockTotal);
	}
}