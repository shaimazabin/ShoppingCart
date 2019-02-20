package softwarefirstHW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class shoppingCartTest 
{

	@BeforeEach
	void setUp() throws Exception 
	{
		
	}

	
	@Test
	public void EmptyCartTest() 
	{
		ShoppingCart cart=new ShoppingCart();
		assertEquals(0, cart.getProductCount());
	}
	
	@Test
	public void AddsingleProductTest()
	{
		ShoppingCart cart=new ShoppingCart();
		product book=new product("Java Book",1,127.0);
		cart.addProduct(book);
		assertEquals(1,cart.getProductCount());
		assertEquals(1, cart.getProductCount());
		assertEquals(127.0, cart.getTotalCartValue());
	}
	
	@Test
	public void addDifferentProductsToTheCart()
	{
		ShoppingCart cart = new ShoppingCart();
		product javaBook = new product("Java Book", 1, 127);
		product webDesignBook = new product("Web Design Book", 1, 100);
		cart.addProduct(javaBook);
		cart.addProduct(webDesignBook);
		assertEquals(2, cart.getProductCount());
		assertEquals(227, cart.getTotalCartValue());
	}

}
