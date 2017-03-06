
public class stopWatch 
{
	private double startTime;
	private double endTime;
	
	public double getStartTime()
	{
		return startTime;
	}
	public double getEndTime()
	{
		return endTime;
	}
	
	public stopWatch ()
	{
		startTime = (System.currentTimeMillis() / 1000);
	}
	
	public void start()
	{
		startTime = (System.currentTimeMillis() / 1000);
		
	}
	public void stop()
	{
		endTime = (System.currentTimeMillis() / 1000);
	}
	public double getElapsedTime()
	{
		double change = endTime - startTime;
		return change;
	}
}
