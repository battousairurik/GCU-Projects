
public class Stock 
{
	String stockSymbol;
	String stockName;
	double previousClosingPrice;
	double currentPrice;
	double percentChange;
	public Stock(String stockSymbol, String stockName)
	{
		this.stockSymbol = stockSymbol;
		this.stockName = stockName;
	}
	public void getChangePercent()
	{
		percentChange = (currentPrice - previousClosingPrice) / 100;
	}
	public void displayStock()
	{
		System.out.println("Stock Symbol: " + stockSymbol);
		System.out.println("Stock Name: " + stockName);
		System.out.println("Percentage Change: " + percentChange);
	}
}
