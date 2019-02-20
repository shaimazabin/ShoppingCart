package softwarefirstHW;

public class product 
{
	private String productName;
	private int count;
	private double cost;
	
	public product(String productName,int count,double cost)
	{
		this.productName=productName;
		this.count=count;
		this.cost=cost;
	}
	
	public String getProdutName()
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName=productName;
	} 
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int count)
	{
		this.count=count;
	} 
	
	public double getCost()
	{
		return cost;
	}
	
	public void setCost(double cost)
	{
		this.cost=cost;
	} 

}
