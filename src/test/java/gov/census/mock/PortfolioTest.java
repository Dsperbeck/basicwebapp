package gov.census.mock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import gov.census.mock.IStockService;
import gov.census.mock.Portfolio;
import gov.census.mock.Stock;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

public class PortfolioTest {

	   Portfolio portfolio;	
	   IStockService stockService;
  
	   @Before
	   public void setupBeforeEachTest(){
		    //Create a portfolio object which is to be tested		
	        this.portfolio = new Portfolio();		
	  
	        //Create the mock object of stock service
	        this.stockService = mock(IStockService.class);		
	  
	        //set the stockService to the portfolio
	        this.portfolio.setStockService(stockService);
	   }
	    
	   @Test
	   public void testMarketValue(){
	    	   
	   //Creates a list of stocks to be added to the portfolio
	       List<Stock> stocks = new ArrayList<Stock>();
	       Stock googleStock = new Stock("1","Google", 10);
	       Stock microsoftStock = new Stock("2","Microsoft",100);	
	    
	       stocks.add(googleStock);
	       stocks.add(microsoftStock);

	       //add stocks to the portfolio
	       portfolio.setStocks(stocks);

	       //mock the behavior of stock service to return the value of various stocks
	       when(stockService.getPrice(googleStock)).thenReturn(50.00);
	       when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);		

	       double actualMarketValue = portfolio.getMarketValue();		
	       double ExpectedMarketValue = 100500;		

	       assertEquals(ExpectedMarketValue, actualMarketValue, 0.1); 
	
	   }
	
	
	  @Test
	  public void setFetchCount() {

/*		  
		Timeline timeline = new Timeline();
	    int expected = 5;
	
	    timeline.setFetchCount( expected );
	    int actual = timeline.getFetchCount();
	
	    assertEquals( expected, actual );
*/
  }
}