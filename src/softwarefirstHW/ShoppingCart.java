package softwarefirstHW;

import java.awt.List;
import java.util.ArrayList;

public class ShoppingCart 
{
	private ArrayList <product> productList=new ArrayList<>();
	private double totalCartValue;

	public int getProductCount() 
	{
		return productList.size();
		
		
	}

	public void addProduct(product book) 
	{
		productList.add(book);
		
	}

	public double getTotalCartValue() 
	{
		if(productList.size()>0)
		{
			for(product product:productList)
			{
				totalCartValue=totalCartValue+product.getCost();
			}
		}
			
		return totalCartValue;
	}

}
