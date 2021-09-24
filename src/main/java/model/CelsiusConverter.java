/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Sep 21, 2021
 */
package model;


public class CelsiusConverter {
	
	private int celsius;
	private int temp;
	
	
	public CelsiusConverter() 
	{
		super();
	}
		
	public CelsiusConverter(int temp) 
	{
		super();
		this.temp = temp;
		celsiusConverter(temp); 
	}
	
	public int getTemp()
	{
		return temp;
	}
	
	public void setTemp(int temp)
	{
		this.temp = temp;
		celsiusConverter(temp);
	}
	
	/**
	 * @return the celsius
	 */
	public int getCelsius() 
	{
		return celsius;
	}

	/**
	 * @param celsius the celsius to set
	 */
	public void setCelsius(int celsius) 
	{
		this.celsius = celsius;
	}

	public void celsiusConverter(int temp) 
	{
		setCelsius((int) ((temp - 32) * .5556));
	}

	@Override
	public String toString() 
	{
		return "CelsiusConverter [celsius=" + celsius + ", temp=" + temp + "]";
	}
	
	

	
	
	
	
	
	

}
